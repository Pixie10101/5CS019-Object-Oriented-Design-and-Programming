import java.util.*;
import java.util.regex.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class SignUp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPlease enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                signUp();
            } else if (choice == 2) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void signUp() {
        System.out.println("\n--- Sign Up ---");

        // Full Name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        if (fullName.length() <= 4) {
            System.out.println("Error: Full name must be greater than 4 characters.");
            return;
        }

        // Contact Number
        System.out.print("Enter your mobile number: ");
        String contactNumber = scanner.nextLine();
        if (!contactNumber.matches("0\\d{9}")) {
            System.out.println("Error: Mobile number must have 10 digits and start with 0.");
            return;
        }

        // Date of Birth
        System.out.print("Enter your Date of Birth (DD/MM/YYYY): ");
        String dobInput = scanner.nextLine();
        if (!isValidDOB(dobInput)) {
            return;
        }

        // Password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (!isValidPassword(password)) {
            return;
        }

        // Password Confirmation
        System.out.print("Confirm your password: ");
        String confirmPassword = scanner.nextLine();
        if (!password.equals(confirmPassword)) {
            System.out.println("Error: Password confirmation does not match the password.");
            return;
        }

        // Successful Signup
        System.out.println("Signup successful! Welcome, " + fullName + "!");
    }

    public static boolean isValidDOB(String dob) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthDate = LocalDate.parse(dob, formatter);
            LocalDate currentDate = LocalDate.now();

            int age = currentDate.getYear() - birthDate.getYear();
            if (birthDate.plusYears(age).isAfter(currentDate)) {
                age--;
            }

            if (age < 21) {
                System.out.println("Error: You must be at least 21 years old to sign up.");
                return false;
            }
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Error: DOB must be in the format DD/MM/YYYY.");
            return false;
        }
    }

    public static boolean isValidPassword(String password) {
        String passwordRegex = "^[A-Z][@&]\\d+$";
        if (!password.matches(passwordRegex)) {
            System.out.println("Error: Password must start with a capital letter, followed by @/& and end with numeric values.");
            return false;
        }
        return true;
    }
}

