package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Product5Test {

    @Test
    public void testProduct5Assertions() {
        Product5 product = new Product5("Laptop", 500.0, 2);

        assertAll("Product5 Tests",
                // Check that the name is not null
                () -> assertNotNull(product.getName(), "The product name should not be null."),

                // Check that the price is positive
                () -> assertTrue(product.getPrice() > 0, "The product price should be a positive value."),

                // Check the isAffordable method with a high budget
                () -> assertTrue(product.isAffordable(1200.0), "The product should be affordable within the budget."),

                // Check the isAffordable method with a low budget
                () -> assertFalse(product.isAffordable(500.0), "The product should not be affordable if the budget is too low.")
        );
    }
}
