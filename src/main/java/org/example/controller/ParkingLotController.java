package org.example.controller;

import org.example.models.Customer;
import org.example.models.Gate;
import org.example.models.Ticket;
import org.example.models.Vehicle;
import org.example.service.ParkingLotService;

public class ParkingLotController {
    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }
    public Ticket issueTicket(Customer customer, Gate gate) {
        return parkingLotService.issueTicket(customer, gate);
    }
}
