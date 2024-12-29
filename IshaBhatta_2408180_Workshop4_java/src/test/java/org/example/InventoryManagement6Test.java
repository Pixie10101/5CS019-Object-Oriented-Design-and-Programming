package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InventoryManagement6Test {

    @Test
    public void testIsProductAvailable6() {
        InventoryManagement6 inventory = new InventoryManagement6();

        // Adding products to the inventory
        inventory.addProduct("Laptop", 10);
        inventory.addProduct("Mouse", 20);

        assertAll("Inventory Tests",
                // Product is available in the requested quantity
                () -> assertTrue(inventory.isProductAvailable6("Laptop", 5),
                        "The product should be available in the requested quantity."),

                // Product is not available in the requested quantity
                () -> assertFalse(inventory.isProductAvailable6("Laptop", 15),
                        "The product should not be available if the requested quantity exceeds the stock."),

                // Another product is available in the requested quantity
                () -> assertTrue(inventory.isProductAvailable6("Mouse", 10),
                        "The product should be available in the requested quantity."),

                // Non-existent product
                () -> assertFalse(inventory.isProductAvailable6("Keyboard", 1),
                        "The product should not be available if it does not exist in the inventory.")
        );
    }
}
