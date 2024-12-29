import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt user to enter the rate of interest
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Prompt user to enter the time period (in years)
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double interest = (principal * rate * time) / 100;

        // Display the calculated interest
        System.out.printf("The simple interest is: %.2f%n", interest);

        // Close the scanner
        scanner.close();
    }
}
