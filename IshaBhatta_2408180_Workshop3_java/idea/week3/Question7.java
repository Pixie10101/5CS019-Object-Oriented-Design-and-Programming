package idea.week3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "foods.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            System.out.println("Enter the names of foods one by one. Type 'done' when you are finished.");

            while (true) {
                System.out.print("Enter food name: ");
                String food = scanner.nextLine().trim();

                if (food.equalsIgnoreCase("done")) {
                    System.out.println("All foods have been saved to " + filename + ".");
                    break;
                }

                if (!food.isEmpty()) { // Avoid saving empty inputs
                    writer.write(food + System.lineSeparator());
                }
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
