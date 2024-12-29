
class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}


class Dog extends Animal {
    private String breed;


    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    @Override
    public void displayInfo() {
        System.out.println("Dog Name: " + getName() + ", Age: " + getAge() + ", Breed: " + breed);
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Create an Animal object
        Animal animal = new Animal("Elephant", 10);
        animal.displayInfo();

        // Create a Dog object
        Dog dog = new Dog("Candy", 4, "Indie");
        dog.displayInfo();
    }
}
