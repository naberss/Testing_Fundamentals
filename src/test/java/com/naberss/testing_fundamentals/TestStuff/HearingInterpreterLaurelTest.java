package com.naberss.testing_fundamentals.TestStuff;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("Laurel")
@SpringJUnitConfig(classes = HearingInterpreterLaurelTest.testConfig.class)
class HearingInterpreterLaurelTest {

    @ComponentScan("com.naberss.testing_fundamentals.TestStuff")
    @Configuration
    static class testConfig {
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("LAUREL", word);
    }
}