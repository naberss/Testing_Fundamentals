package com.naberss.testing_fundamentals.Project2;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("project2")
public interface project2_Interface {


    @BeforeAll
    @DisplayName("My PersonTest")
    default void personTest(TestInfo testInfo) {
        System.out.print(testInfo.getTags());
    }
}
