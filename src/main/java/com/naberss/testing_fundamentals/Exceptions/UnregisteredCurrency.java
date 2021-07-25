package com.naberss.testing_fundamentals.Exceptions;

public class UnregisteredCurrency extends RuntimeException {

    public UnregisteredCurrency(String UnregisteredCurrency) {
        super("Unregistered Currency: " + UnregisteredCurrency);
    }
}
