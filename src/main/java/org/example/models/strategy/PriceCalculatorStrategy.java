package org.example.models.strategy;

import org.example.models.Ticket;

public interface PriceCalculatorStrategy {
    double calculatePrice(Ticket ticket);
}
