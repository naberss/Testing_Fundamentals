package com.naberss.testing_fundamentals.Money_Converter.Entities;

import java.util.Objects;

public abstract class Currency {

    protected String EA;
    protected double ratio;

    public String getEA() {
        return this.EA;
    }

    public double getRatio() {
        return this.ratio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Currency currency = (Currency) o;
        return Objects.equals(getEA(), currency.getEA());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEA(), getRatio());
    }
}
