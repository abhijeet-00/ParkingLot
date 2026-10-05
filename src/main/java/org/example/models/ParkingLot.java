package org.example.models;

import org.example.models.strategy.AssignParkingSpotStrategy;
import org.example.models.strategy.PriceCalculatorStrategy;

import java.util.List;

public class ParkingLot {
    List<Floor> floors;
    List<Gate> gates;
    AssignParkingSpotStrategy assignParkingSpotStrategy;
    PriceCalculatorStrategy priceCalcStrategy;
    Ticket generateTicket(Customer customer, Gate gate) {
        return null;
    }
    Bill generateBill(Ticket ticket) {
        return null;
    }
}
