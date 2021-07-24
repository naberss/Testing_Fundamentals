package com.naberss.testing_fundamentals.Entities;

import java.util.Objects;

public class Franc extends Money {

    private int amount;

    public Franc(int amount) {
        super(amount);
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}






