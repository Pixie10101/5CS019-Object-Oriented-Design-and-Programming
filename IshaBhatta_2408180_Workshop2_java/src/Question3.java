// Base class Animal
class Animal1 {
    private String name;

    // Constructor with name parameter
    public Animal1(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to display animal info
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}

// Subclass Dog
class Dog1 extends Animal1 {
    private String breed;

    // Constructor for Dog that calls the superclass constructor
    public Dog1(String name, String breed) {
        super(name); // Call the constructor of the Animal class
        this.breed = breed;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Method to display dog info
    @Override
    public void displayInfo() {
        System.out.println("Dog Name: " + getName() + ", Breed: " + breed);
    }
}

// Main class to demonstrate
public class Question3 {
    public static void main(String[] args) {
        // Create a Dog object using the constructor
        Dog1 dog = new Dog1("Candy", "Indie");

        // Display dog information
        dog.displayInfo();
    }
}
