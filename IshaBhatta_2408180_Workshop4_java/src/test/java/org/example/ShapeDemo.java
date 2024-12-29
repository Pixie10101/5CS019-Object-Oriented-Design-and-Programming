package org.example;

// Main class to demonstrate functionality
public class ShapeDemo {
    public static void main(String[] args) {
        // Create Circle object
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        // Create Rectangle object
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
