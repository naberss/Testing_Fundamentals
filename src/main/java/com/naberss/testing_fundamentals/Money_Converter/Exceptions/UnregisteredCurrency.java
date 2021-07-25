package com.naberss.testing_fundamentals.Money_Converter.Exceptions;

public class UnregisteredCurrency extends RuntimeException {

    public UnregisteredCurrency(String UnregisteredCurrency) {
        super("Unregistered Currency: " + UnregisteredCurrency);
    }
}
