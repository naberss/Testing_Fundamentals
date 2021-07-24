package com.naberss.testing_fundamentals.Entities;

public class Franc extends Money {

    public Franc(int amount) {
        super(amount);
        this.currency = "CHF";
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

}






