package org.example;

import java.util.ArrayList;
import java.util.List;

public class Product5 {
    private String name;
    private double price;
    private int quantity;

    public Product5(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAffordable(double budget) {
        return (price * quantity) <= budget;
    }
}


