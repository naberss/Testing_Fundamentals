package com.naberss.testing_fundamentals.Entities_Test;

import com.naberss.testing_fundamentals.Entities.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.getAmount());
    }
}
