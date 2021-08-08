package com.naberss.testing_fundamentals.TestStuff;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@TestPropertySource("classpath:Dynamic.properties")
@ActiveProfiles("Dynamic")
@SpringJUnitConfig(classes = DynamicWordProducerTest.testConfig.class)
class DynamicWordProducerTest {

    @Configuration
    @ComponentScan(value = "com.naberss.testing_fundamentals.TestStuff")
    static class testConfig{
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("pereira", word);
    }

}