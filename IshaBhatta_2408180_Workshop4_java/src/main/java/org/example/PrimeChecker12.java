package org.example;

public class PrimeChecker12 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // Eliminate other even numbers
        }
        // Check for factors up to the square root of the number
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false; // A factor was found
            }
        }
        return true; // No factors were found, the number is prime
    }

    public static void main(String[] args) {
        // Example usage
        int number = 29;
        System.out.println(number + " is prime? " + isPrime(number));
    }
}

