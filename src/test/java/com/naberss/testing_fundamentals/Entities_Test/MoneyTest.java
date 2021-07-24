package com.naberss.testing_fundamentals.Entities_Test;

import com.naberss.testing_fundamentals.Entities.Dollar;
import com.naberss.testing_fundamentals.Entities.Franc;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.getAmount());
        product = five.times(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    void testEqualityDollar() {
        try {
            assertEquals(new Dollar(5), new Dollar(5));
            assertNotEquals(new Dollar(5), new Franc(5));
        } catch (AssertionFailedError e) {
            e.printStackTrace();
        }
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(10, product.getAmount());
        product = five.times(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    void testEqualityFranc() {
        try {
            assertEquals(new Franc(5), new Franc(5));
            assertNotEquals(new Franc(58), new Franc(5));
        } catch (AssertionFailedError e) {
            e.printStackTrace();
        }
    }


}
