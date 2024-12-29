// Base class Shape
abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Circle circle = new Circle(6.0);

        System.out.println("Circle with radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
