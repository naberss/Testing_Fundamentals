package com.naberss.testing_fundamentals.Project2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll this has to be static");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloWorldTest() {
        assertEquals("hello world", greeting.helloWorld());
    }

    @Test
    void helloWorldTest2() {
        Greeting greeting = new Greeting();
        assertEquals("hello lucas", greeting.helloWorld("lucas"));
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll this has to be static");
    }

}