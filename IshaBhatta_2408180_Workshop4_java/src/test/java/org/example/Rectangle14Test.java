package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.awt.*;

public class Rectangle14Test {

    private Rectangle rectangle;

    @BeforeEach
    public void setup() {
        // Initialize the Rectangle object before each test
        rectangle = new Rectangle((int) 5.0, (int) 10.0);  // Example: length = 5.0, width = 10.0
        System.out.println("Rectangle object initialized.");
    }

    @Test
    public void testArea() {
        // Test for the area of the rectangle
        double expectedArea = 5.0 * 10.0;  // length * width
        assertEquals(expectedArea, rectangle.createUnion(), "Area calculation is incorrect.");
    }

    @Test
    public void testPerimeter() {
        // Test for the perimeter of the rectangle
        double expectedPerimeter = 2 * (5.0 + 10.0);  // 2 * (length + width)
        assertEquals(expectedPerimeter, rectangle.perimeter(), "Perimeter calculation is incorrect.");
    }

    @Test
    public void testSetLength() {
        // Test for setting a new length and recalculating the area and perimeter
        rectangle.setLength(7.0);
        double expectedArea = 7.0 * 10.0;
        double expectedPerimeter = 2 * (7.0 + 10.0);

        assertEquals(expectedArea, rectangle.area(), "Area after changing length is incorrect.");
        assertEquals(expectedPerimeter, rectangle.perimeter(), "Perimeter after changing length is incorrect.");
    }

    @Test
    public void testSetWidth() {
        // Test for setting a new width and recalculating the area and perimeter
        rectangle.setWidth(8.0);
        double expectedArea = 5.0 * 8.0;
        double expectedPerimeter = 2 * (5.0 + 8.0);

        assertEquals(expectedArea, rectangle.area(), "Area after changing width is incorrect.");
        assertEquals(expectedPerimeter, rectangle.perimeter(), "Perimeter after changing width is incorrect.");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Test completed. Resetting states if necessary.");
    }
}
