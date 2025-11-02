package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingTest {
    @Test
    void testHelloNull() {
        Greeting greeting = new Greeting();
        String result = greeting.sayHello(null);
        assertEquals("Hello, Friend", result);
    }
}