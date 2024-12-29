package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Calculator10Test {

    private Calculator10 calculator;

    @BeforeAll
    public static void setupClass() {
        System.out.println("Setting up global configuration...");
    }

    @AfterAll
    public static void teardownClass() {
        System.out.println("Cleaning up global resources...");
    }

    @BeforeEach
    public void setup() {
        calculator = new Calculator10();
        System.out.println("Calculator object initialized.");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Test completed. Resetting states if necessary.");
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3), "Addition test failed.");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2), "Subtraction test failed.");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "Multiplication test failed.");
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), "Division test failed.");
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6, 0);
        }, "Expected an ArithmeticException for division by zero.");
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
