package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void testCelsiusToFahrenheit() {
        // Test cases for Celsius to Fahrenheit
        assertEquals(32.0, Question1.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, Question1.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40.0, Question1.celsiusToFahrenheit(-40), 0.01);
        assertEquals(98.6, Question1.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        // Test cases for Fahrenheit to Celsius
        assertEquals(0.0, Question1.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, Question1.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40.0, Question1.fahrenheitToCelsius(-40), 0.01);
        assertEquals(37.0, Question1.fahrenheitToCelsius(98.6), 0.01);
    }
}
