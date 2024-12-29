class Rectangle {
    // Instance variables
    private double width;
    private double height;

    // Constructor to initialize the width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the toString() method to return a readable format of the rectangle's dimensions
    @Override
    public String toString() {
        return "Rectangle [Width: " + width + ", Height: " + height + "]";
    }
}

//Main class to test the Rectangle class and toString() method



public class Question17{

    public static void main(String[] args) {

        // Create a Rectangle object with width and height
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        // Display the rectangle's dimensions using the overridden toString() method
        System.out.println(rectangle);


    }

}

