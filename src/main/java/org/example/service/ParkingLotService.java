package org.example.service;

import org.example.models.Customer;
import org.example.models.Gate;
import org.example.models.Ticket;

public interface ParkingLotService {
    Ticket issueTicket(Customer customer, Gate gate);
}
