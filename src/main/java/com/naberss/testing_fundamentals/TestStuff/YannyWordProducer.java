package com.naberss.testing_fundamentals.TestStuff;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Yanny")
@Primary
public class YannyWordProducer implements WordProducer{

    @Override
    public String getWord() {
        return "YANNY";
    }
}
