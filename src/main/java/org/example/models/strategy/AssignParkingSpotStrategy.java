package org.example.models.strategy;

import org.example.models.ParkingSpot;
import org.example.models.Vehicle;

public interface AssignParkingSpotStrategy {
    ParkingSpot assignParkingSpot(Vehicle vehicle);
}
