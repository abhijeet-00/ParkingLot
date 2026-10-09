package org.example.models;

public class Gate extends BaseEntity {
    private String gateNumber;
    private GateType gateType;

    public Gate(String gateNumber, GateType gateType) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "gateNumber='" + gateNumber + '\'' +
                ", gateType=" + gateType +
                '}';
    }
}
