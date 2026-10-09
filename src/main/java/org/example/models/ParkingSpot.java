package org.example.models;

public class ParkingSpot extends BaseEntity {
    private String spotNumber;
    private VehicleType supportVehicleType;
    private SpotStatus status;

    public ParkingSpot(String spotNumber, VehicleType supportVehicleType, SpotStatus status) {
        this.spotNumber = spotNumber;
        this.supportVehicleType = supportVehicleType;
        this.status = status;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    public VehicleType getSupportVehicleType() {
        return supportVehicleType;
    }

    public void setSupportVehicleType(VehicleType supportVehicleType) {
        this.supportVehicleType = supportVehicleType;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber='" + spotNumber + '\'' +
                ", supportVehicleType=" + supportVehicleType +
                ", status=" + status +
                '}';
    }
}
