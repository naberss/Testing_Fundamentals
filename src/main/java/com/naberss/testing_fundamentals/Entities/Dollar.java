package com.naberss.testing_fundamentals.Entities;

import java.util.Objects;

public class Dollar extends Money {

    private int amount;

    public Dollar(int amount) {
        super(amount);
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}
