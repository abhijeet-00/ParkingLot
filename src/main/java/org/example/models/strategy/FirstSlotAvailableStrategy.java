package org.example.models.strategy;

import org.example.models.ParkingLot;
import org.example.models.ParkingSpot;
import org.example.models.SpotStatus;
import org.example.models.Vehicle;

import java.util.List;

public class FirstSlotAvailableStrategy implements AssignParkingSpotStrategy {
    @Override
    public ParkingSpot assignParkingSpot(Vehicle vehicle, List<ParkingSpot> parkingSpots) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getSupportVehicleType().equals(vehicle.getVehicleType()) && parkingSpot.getStatus() == SpotStatus.AVAILABLE) {
                return parkingSpot;
            }
        }
        return null;
    }
}
