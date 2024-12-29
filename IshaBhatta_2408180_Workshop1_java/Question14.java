import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in Dollars $ : ");
        double amount = sc.nextDouble();

        double NepRu= amount * 134;
        System.out.println("The amount in Dollars is:" +NepRu);

    }
}
