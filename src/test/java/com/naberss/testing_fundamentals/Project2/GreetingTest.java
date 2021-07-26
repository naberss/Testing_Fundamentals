package com.naberss.testing_fundamentals.Project2;

import com.naberss.testing_fundamentals.Money_Converter.Exceptions.UnregisteredCurrency;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

//@Disabled(value = "it happens")
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
        System.out.printf(greeting.helloWorld("lucas"));
        assertTrue("hello lucas" == greeting.helloWorld("lucas"), () -> "not the same thing");
    }


    @Test
    void expectedException() {
        assertThrows(UnregisteredCurrency.class, () -> {
            throw new UnregisteredCurrency("test");
        });
    }

    @Test
    void timeoutTest() {
        assertTimeout(Duration.ofMillis(100),
                () -> Thread.sleep(85));
    }

    @Disabled("because i want to '2'")
    @Test
    void timeoutTestPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(100),
                () -> Thread.sleep(105));
    }

    @Test
    void AssumptionTest() {
        Assumptions.assumeTrue(1==0);
        Assumptions.assumeFalse(1==0);

    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll this has to be static");
    }

}