package com.naberss.testing_fundamentals.Money_Converter_Tests;

import com.naberss.testing_fundamentals.Money_Converter.Entities.Dollar;
import com.naberss.testing_fundamentals.Money_Converter.Entities.Franc;
import com.naberss.testing_fundamentals.Money_Converter.Entities.Money;
import com.naberss.testing_fundamentals.Money_Converter.Interfaces.Converter;
import com.naberss.testing_fundamentals.Project2.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    
    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEqualityDollar() {
        /*try {*/
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.franc(5));
       /* } catch (AssertionFailedError e) {
            e.printStackTrace();
        }*/
    }

    @Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEqualityFranc() {
        /*try {*/
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.dollar(5), Money.franc(5));
        /*} catch (AssertionFailedError e) {
            e.printStackTrace();
        }*/
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).getCurrency().getEA());
        assertEquals("CHF", Money.franc(1).getCurrency().getEA());
    }

    @Test
    void testConverter() {
        Money dollar = Money.dollar(1);
        Money franc = Money.franc(1);
        Money converted = Converter.convert(dollar, new Franc());
        assertEquals(0.97, converted.getAmount());
        converted = Converter.convert(franc, new Dollar());
        assertEquals(1.0309278350515465, converted.getAmount());
    }

    @Test
    void testConvertedSum() {
        Money dollar1 = Money.dollar(1);
        Money dollar2 = Money.dollar(1);
        assertEquals(1.94, Converter.Sum(new Franc(), dollar1, dollar2).getAmount());
        Money franc1 = Money.franc(1);
        Money franc2 = Money.franc(1);
        assertEquals(2.061855670103093, Converter.Sum(new Dollar(), franc1, franc2).getAmount());
    }
}
