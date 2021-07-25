package com.naberss.testing_fundamentals.Interfaces;

import com.naberss.testing_fundamentals.Entities.Currency;
import com.naberss.testing_fundamentals.Entities.Money;

public interface Converter {

    static Money convert(Money fromCurrency, Currency toCurrency) {
        double parsedValue = ((toCurrency.getRatio() / fromCurrency.getCurrency().getRatio()) * fromCurrency.getAmount());

        return new Money(parsedValue, toCurrency);
    }


    static Money Sum(Currency currency, Money... money) {
        double sum = 0L;
        for (Money m : money) {
            if (m.getCurrency() == currency) {
                sum += m.getAmount();
            } else {
                sum += Converter.convert(m, currency).getAmount();
            }
        }

        return new Money(sum, currency);
    }
}
