import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items purchased: ");
        int numbers = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the unit price of the item: ");
        int unit = sc1.nextInt();

        int total = numbers * unit;
        System.out.println("The total price is $" + total);



    }
}
