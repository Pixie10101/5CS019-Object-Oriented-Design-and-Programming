
class Calculator {


    public int add(int a, int b) {
        return a + b;
    }


    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public double add(double a, double b) {
        return a + b;
    }


    public double add(double a, double b, double c) {
        return a + b + c;
    }
}


public class Question7 {
    public static void main(String[] args) {
        // a. Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // b. Add two integers (5 and 8) and display the result
        int resultIntTwo = calculator.add(5, 8);
        System.out.println("Addition of two integers (5, 8): " + resultIntTwo);

        // c. Add three integers (10, 15, 20) and display the result
        int resultIntThree = calculator.add(10, 15, 20);
        System.out.println("Addition of three integers (10, 15, 20): " + resultIntThree);

        // d. Add two doubles (3.5 and 2.7) and display the result
        double resultDoubleTwo = calculator.add(3.5, 2.7);
        System.out.println("Addition of two doubles (3.5, 2.7): " + resultDoubleTwo);

        // e. Add three doubles (1.1, 2.2, 3.3) and display the result
        double resultDoubleThree = calculator.add(1.1, 2.2, 3.3);
        System.out.println("Addition of three doubles (1.1, 2.2, 3.3): " + resultDoubleThree);
    }
}
