package com.naberss.testing_fundamentals.Money_Converter.Entities;

import com.naberss.testing_fundamentals.Money_Converter.Interfaces.Converter;

import java.util.Objects;

public class Money implements Converter {

    protected double amount;
    protected Currency currency;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public Money times(double multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    public static Money dollar(double amount) {
        return new Money(amount, new Dollar());
    }

    public static Money franc(double amount) {
        return new Money(amount, new Franc());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Money money = (Money) o;
        return getAmount() == money.getAmount() && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount(), currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
