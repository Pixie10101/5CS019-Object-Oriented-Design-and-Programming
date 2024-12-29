class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;


    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Provided";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();  // Blank line for separation
    }
}

public class Question15 {

    public static void main(String[] args) {
        // Creating Person objects using the default constructor
        Person person1 = new Person();
        person1.displayDetails();

        // Creating Person objects using the parameterized constructor
        Person person2 = new Person("John Doe", 25, "1234 Elm Street");
        person2.displayDetails();

        Person person3 = new Person("Jane Smith", 30, "5678 Oak Avenue");
        person3.displayDetails();
    }
}
