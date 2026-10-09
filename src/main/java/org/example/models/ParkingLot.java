package org.example.models;

import org.example.models.strategy.AssignParkingSpotStrategy;
import org.example.models.strategy.PriceCalculatorStrategy;

import java.util.List;

public class ParkingLot extends BaseEntity {
    private List<Floor> floors;
    private List<Gate> gates;
    private AssignParkingSpotStrategy assignParkingSpotStrategy;
    private PriceCalculatorStrategy priceCalcStrategy;

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public AssignParkingSpotStrategy getAssignParkingSpotStrategy() {
        return assignParkingSpotStrategy;
    }

    public void setAssignParkingSpotStrategy(AssignParkingSpotStrategy assignParkingSpotStrategy) {
        this.assignParkingSpotStrategy = assignParkingSpotStrategy;
    }

    public PriceCalculatorStrategy getPriceCalcStrategy() {
        return priceCalcStrategy;
    }

    public void setPriceCalcStrategy(PriceCalculatorStrategy priceCalcStrategy) {
        this.priceCalcStrategy = priceCalcStrategy;
    }

    Bill generateBill(Ticket ticket) {
        return null;
    }
}
