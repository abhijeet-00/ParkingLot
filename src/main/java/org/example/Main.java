package org.example;

import org.example.controller.ParkingLotController;
import org.example.models.*;
import org.example.models.strategy.FirstSlotAvailableStrategy;
import org.example.repository.BaseRepository;
import org.example.repository.ParkingSpotRepository;
import org.example.service.ParkingLotService;
import org.example.service.ParkingLotServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseRepository<ParkingSpot> baseRepository = new ParkingSpotRepository();
        baseRepository.save(new ParkingSpot("1A", VehicleType.BIKE, SpotStatus.AVAILABLE));
        ParkingLotService parkingLotService = new ParkingLotServiceImpl(new FirstSlotAvailableStrategy(), baseRepository);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        Ticket ticket = parkingLotController.issueTicket(new Customer
                ("Abhijeet", new Vehicle("JK214031", VehicleType.BIKE)),
                new Gate("1A", GateType.ENTRY));
        System.out.println(ticket);
    }
}