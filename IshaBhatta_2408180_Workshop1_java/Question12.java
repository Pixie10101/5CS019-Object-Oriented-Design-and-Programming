import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double radius = sc.nextDouble();

        double Area= Math.PI * radius * radius;
        System.out.println("The area of the circle is "+Area);
    }
}
