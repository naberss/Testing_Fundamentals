package com.naberss.testing_fundamentals.Entities_Test;

import com.naberss.testing_fundamentals.Entities.Dollar;
import com.naberss.testing_fundamentals.Entities.Franc;
import com.naberss.testing_fundamentals.Entities.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = Money.dollar(5);
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
        Franc five = Money.franc(5);
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
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());

    }
}
