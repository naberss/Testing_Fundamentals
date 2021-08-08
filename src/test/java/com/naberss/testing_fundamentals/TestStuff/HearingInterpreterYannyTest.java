package com.naberss.testing_fundamentals.TestStuff;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(classes = HearingInterpreterYannyTest.testConfig.class)
@ActiveProfiles("Yanny")
public class HearingInterpreterYannyTest {

    @Configuration
    @Profile("Yanny")
    static class testConfig{
        @Bean
        HearingInterpreter hearingInterpreter(){
            return new HearingInterpreter(new YannyWordProducer());
        }
    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();
        assertEquals("YANNY", word);
    }
}