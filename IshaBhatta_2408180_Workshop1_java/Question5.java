import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square:");

        double side = sc.nextDouble();
        double area = side * side;

        System.out.println("The area of the square is " + area);

        sc.close();
    }
}

