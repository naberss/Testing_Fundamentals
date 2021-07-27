package com.naberss.testing_fundamentals.Project2;

import com.naberss.testing_fundamentals.Money_Converter.Exceptions.UnregisteredCurrency;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

//@Disabled(value = "it happens")
class GreetingTest implements project2_Interface {

    Greeting greeting;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll this has to be static");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_16)
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Lucas")
    @DisplayName("just testing")
    @Test
    void helloWorldTest() {
        assertAll("Test List 1",
                () -> assertAll("Test List2",
                        () -> assertEquals("hello world", greeting.helloWorld()),
                        () -> assertEquals("hello lucas", greeting.helloWorld("lucas"))),
                () -> assertEquals("hello world", greeting.helloWorld()),
                () -> assertEquals("hello lucas", greeting.helloWorld("lucas")));

    }

    @Disabled(value = "because i want to")
    @Test
    void helloWorldTest2() {
        Greeting greeting = new Greeting();
        assertEquals("hello lucas", greeting.helloWorld("lucas"));
        System.out.print(greeting.helloWorld("lucas"));
        assertSame("hello lucas", greeting.helloWorld("lucas"), "not the same thing");
    }


    @Test
    void expectedException() {
        assertThrows(UnregisteredCurrency.class, () -> {
            throw new UnregisteredCurrency("test");
        });
    }

    @DisplayName("TimingTest")
    @RepeatedTest(value = 2, name = "{displayName}: {currentRepetition} - {totalRepetitions}")
    void timeoutTest() {
        assertTimeout(Duration.ofMillis(100),
                () -> Thread.sleep(5));
    }

    @Disabled("because i want to '2'")
    @Test
    void timeoutTestPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(100),
                () -> Thread.sleep(105));
    }

    @Test
    void AssumptionTest() {
        Assumptions.assumeTrue(1 == 0);
        Assumptions.assumeFalse(1 == 0);

    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll this has to be static");
    }

}