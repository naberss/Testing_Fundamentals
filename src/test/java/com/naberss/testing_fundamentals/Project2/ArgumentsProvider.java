package com.naberss.testing_fundamentals.Project2;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ArgumentsProvider implements org.junit.jupiter.params.provider.ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of("FL", 5),
                Arguments.of("OH", 2),
                Arguments.of("MI", 3));
    }
}
