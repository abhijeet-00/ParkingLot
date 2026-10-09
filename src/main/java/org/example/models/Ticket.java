package org.example.models;

import java.util.Date;

public class Ticket extends BaseEntity {
    private Customer customer;
    private ParkingSpot parkingSpot;
    private Floor floor;
    private Date entryTime;
    private Gate gate;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "customer=" + customer +
                ", parkingSpot=" + parkingSpot +
                ", floor=" + floor +
                ", entryTime=" + entryTime +
                ", gate=" + gate +
                '}';
    }
}
