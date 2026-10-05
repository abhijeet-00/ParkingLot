package org.example.models;

import java.util.Date;

public class Bill {
    Ticket ticket;
    Date exitTime;
    double totalAmount;
    BillStatus status;
    PaymentMode mode;
    boolean payBill() {
        return false;
    }
}
