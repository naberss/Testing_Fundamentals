package com.naberss.testing_fundamentals.Project2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@Tag("project2")
public interface project2_Interface {

    @BeforeEach
    default void myTestMethod() {
        System.out.println("thats it folks");
    }
}
