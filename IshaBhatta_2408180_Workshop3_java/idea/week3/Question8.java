package idea.week3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }
}

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "students.csv";

        try (FileWriter writer = new FileWriter(filename)) {
            // Write the header of the CSV file
            writer.write("ID,Name,Age,Grade\n");

            System.out.println("Enter student information. Type 'done' to finish.");

            int id = 1; // ID starts from 1
            while (true) {
                System.out.print("Enter student name (or 'done' to stop): ");
                String name = scanner.nextLine().trim();
                if (name.equalsIgnoreCase("done")) {
                    System.out.println("All student information has been saved to " + filename + ".");
                    break;
                }

                System.out.print("Enter age: ");
                int age = scanner.nextInt();

                System.out.print("Enter grade (A, B, C, D, E, F): ");
                char grade = scanner.next().toUpperCase().charAt(0);
                scanner.nextLine(); // Clear the newline character

                // Validate grade input
                if ("ABCDEF".indexOf(grade) == -1) {
                    System.out.println("Invalid grade. Please enter a grade between A and F.");
                    continue;
                }

                // Create a Student object and write its data to the CSV file
                Student student = new Student(name, age, grade);
                writer.write(id + "," + student.getName() + "," + student.getAge() + "," + student.getGrade() + "\n");
                id++;
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
