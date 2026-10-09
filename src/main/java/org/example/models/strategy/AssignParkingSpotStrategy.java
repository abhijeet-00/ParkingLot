package org.example.models.strategy;

import org.example.models.ParkingSpot;
import org.example.models.Vehicle;

import java.util.List;

public interface AssignParkingSpotStrategy {
    ParkingSpot assignParkingSpot(Vehicle vehicle, List<ParkingSpot> parkingSpots);
}
