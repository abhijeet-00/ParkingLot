package org.example.service;

import org.example.models.*;
import org.example.models.strategy.AssignParkingSpotStrategy;
import org.example.repository.BaseRepository;
import org.example.repository.ParkingSpotRepository;

import java.util.Date;

public class ParkingLotServiceImpl implements  ParkingLotService {
    private final AssignParkingSpotStrategy assignParkingSpotStrategy;
    private final BaseRepository<ParkingSpot> parkingSpotRepository;
    public ParkingLotServiceImpl(AssignParkingSpotStrategy assignParkingSpotStrategy, BaseRepository<ParkingSpot> parkingSpotRepository) {
        this.assignParkingSpotStrategy = assignParkingSpotStrategy;
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Override
    public Ticket issueTicket(Customer customer, Gate gate) {
        Ticket ticket = new Ticket();
        ticket.setCustomer(customer);
        ticket.setGate(gate);
        ticket.setEntryTime(new Date());
        synchronized (this) {
            ParkingSpot parkingSpot = assignParkingSpotStrategy.assignParkingSpot(customer.getVehicle(), parkingSpotRepository.findAll());
            if (parkingSpot == null) {
                throw new RuntimeException("No spot available");
            }
            parkingSpot.setStatus(SpotStatus.OCCUPIED);
            ticket.setParkingSpot(parkingSpot);
        }
        System.out.println("Ticket issued: " + ticket);
        return ticket;
    }
}
