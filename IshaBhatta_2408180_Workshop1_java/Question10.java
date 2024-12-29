import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int width = sc.nextInt();

        int perimeter = length * width;
        System.out.println("The perimeter of the rectangle is " + perimeter);



    }
}
