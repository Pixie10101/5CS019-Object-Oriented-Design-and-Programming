package idea.week3;

// Interface PaymentMethod
interface Question9 {
    void processPayment(double amount);
}

// Class Esewa implements PaymentMethod
class Esewa1 implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs. " + amount + " through eSewa.");
    }
}

// Class Khalti implements PaymentMethod
class Khalti1 implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs. " + amount + " through Khalti.");
    }
}

// Main class to test
public class Question5 {
    public static void main(String[] args) {
        // Create objects of Esewa and Khalti
        PaymentMethod esewa = new Esewa();
        PaymentMethod khalti = new Khalti();

        // Test processPayment method
        System.out.println("Using eSewa:");
        esewa.processPayment(1500.0);

        System.out.println("\nUsing Khalti:");
        khalti.processPayment(2000.0);
    }
}
