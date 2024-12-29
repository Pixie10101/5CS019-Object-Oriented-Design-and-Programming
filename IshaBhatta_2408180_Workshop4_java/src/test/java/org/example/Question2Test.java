package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void testAdd() {
        Question2 calculator = new Question2();
        // Test cases for addition
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-10, calculator.add(-7, -3));
        assertEquals(100, calculator.add(50, 50));
    }
}
