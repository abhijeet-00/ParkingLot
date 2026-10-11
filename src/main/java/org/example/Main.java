package org.example;

import org.example.controller.ParkingLotController;
import org.example.models.*;
import org.example.models.strategy.FirstSlotAvailableStrategy;
import org.example.repository.BaseRepository;
import org.example.repository.ParkingSpotRepository;
import org.example.service.ParkingLotService;
import org.example.service.ParkingLotServiceImpl;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseRepository<ParkingSpot> baseRepository = new ParkingSpotRepository();
        baseRepository.save(new ParkingSpot("1A", VehicleType.BIKE, SpotStatus.AVAILABLE));

        ParkingLotService parkingLotService =
                new ParkingLotServiceImpl(new FirstSlotAvailableStrategy(), baseRepository);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CountDownLatch startLatch = new CountDownLatch(1);

        Callable<Ticket> task1 = () -> {
            startLatch.await();
            return parkingLotController.issueTicket(
                    new Customer("Abhijeet", new Vehicle("JK214031", VehicleType.BIKE)),
                    new Gate("1A", GateType.ENTRY)
            );
        };

        Callable<Ticket> task2 = () -> {
            startLatch.await();
            return parkingLotController.issueTicket(
                    new Customer("Rahul", new Vehicle("MH12AB1234", VehicleType.BIKE)),
                    new Gate("1A", GateType.ENTRY)
            );
        };

        Future<Ticket> future1 = executorService.submit(task1);
        Future<Ticket> future2 = executorService.submit(task2);

        startLatch.countDown();

        Ticket ticket1 = future1.get();
        Ticket ticket2 = future2.get();

        System.out.println("Ticket 1 -> " + ticket1);
        System.out.println("Ticket 2 -> " + ticket2);

        executorService.shutdown();
    }
}