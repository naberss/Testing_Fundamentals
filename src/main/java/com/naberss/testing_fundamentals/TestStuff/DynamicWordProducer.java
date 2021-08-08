package com.naberss.testing_fundamentals.TestStuff;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("Dynamic")
@Component
public class DynamicWordProducer implements WordProducer {

    private String word;

    @Value("${test}")
    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String getWord() {
        return this.word;
    }
}
