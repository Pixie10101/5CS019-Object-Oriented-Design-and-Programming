import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in miles: ");
        double distance = sc.nextDouble();

        double kilometers = distance * 1.609;
        System.out.println("The given distance in Kilometers is: " + kilometers);


    }
}
