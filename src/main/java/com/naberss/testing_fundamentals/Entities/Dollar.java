package com.naberss.testing_fundamentals.Entities;

public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount);
        this.currency = "USD";
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

}
