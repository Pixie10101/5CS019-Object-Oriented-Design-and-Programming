import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform arithmetic operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (num2/num1);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        // Close the scanner
        scanner.close();
    }
}

