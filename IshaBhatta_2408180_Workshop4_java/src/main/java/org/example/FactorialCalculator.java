package org.example;

public class FactorialCalculator {
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
