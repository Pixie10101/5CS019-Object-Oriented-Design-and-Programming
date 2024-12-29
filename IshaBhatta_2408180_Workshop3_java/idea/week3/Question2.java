package idea.week3;


public class Question2 {
    private String model;
    private double price;
    private double fuelLevel; // Read-only

    // Constructor
    public Question2(String model, double price, double fuelLevel) {
        this.model = model;
        this.price = price;
        this.fuelLevel = fuelLevel;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for fuelLevel (read-only)
    public double getFuelLevel() {
        return fuelLevel;
    }

    public static void main(String[] args) {

        Question2 car1 = new Question2("White Mustang", 1000000.00, 80.00);
        car1.setModel("Black Mustang");
        car1.setPrice(1200000.00);


        System.out.println("Model: " + car1.getModel());
        System.out.println("Price: $" + car1.getPrice());
        System.out.println("Fuel Level: " + car1.getFuelLevel() + " Liters");
    }
}
