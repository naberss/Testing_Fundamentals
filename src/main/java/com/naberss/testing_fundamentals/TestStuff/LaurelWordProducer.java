package com.naberss.testing_fundamentals.TestStuff;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Laurel")
public class LaurelWordProducer implements WordProducer {

    @Bean
    HearingInterpreter hearingInterpreter() {
        return new HearingInterpreter(new LaurelWordProducer());
    }

    @Override
    public String getWord() {
        return "LAUREL";
    }
}
