package org.example;

import static org.junit.jupiter.api.Assertions.*;

// Base class
abstract class Shape {
    // Method to calculate area, default implementation returns 0
    public double area() {
        return 0;
    }
}

// Derived class for Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method to calculate the area of a circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Derived class for Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the area method to calculate the area of a rectangle
    @Override
    public double area() {
        return length * width;
    }
}

