import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of cylinder : ");
        double height = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder : ");
        double radius = sc1.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("The area of the cylinder is " + area);


    }
}
