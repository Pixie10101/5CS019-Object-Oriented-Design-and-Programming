package org.example;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement6 {
    private Map<String, Integer> inventory;

    public InventoryManagement6() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(String productName, int quantity) {
        inventory.put(productName, inventory.getOrDefault(productName, 0) + quantity);
    }

    public boolean isProductAvailable6(String productName, int quantity) {
        return inventory.getOrDefault(productName, 0) >= quantity;
    }
}




