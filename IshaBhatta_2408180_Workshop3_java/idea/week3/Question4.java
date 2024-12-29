package idea.week3;


// Step 1: Create an abstract class GameCharacter
    abstract class GameCharacter {

    // Abstract method for attack
    public abstract void attack();

    // Abstract method for defend
    public abstract void defend();
}

// Step 2: Create a Warrior subclass
class Warrior extends GameCharacter {

    // Warrior's implementation of the attack method
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    // Warrior's implementation of the defend method
    @Override
    public void defend() {
        System.out.println("Warrior defends with a shield!");
    }
}

// Step 3: Create an Archer subclass
class Archer extends GameCharacter {

    // Archer's implementation of the attack method
    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow and arrow!");
    }

    // Archer's implementation of the defend method
    @Override
    public void defend() {
        System.out.println("Archer defends with agility and dodges the attack!");
    }
}

// Step 4: Testing the classes
public class Question4 {
    public static void main(String[] args) {
        // Create objects of Warrior and Archer
        GameCharacter warrior = new Warrior();
        GameCharacter archer = new Archer();

        // Call attack and defend methods on both objects
        warrior.attack();
        warrior.defend();

        archer.attack();
        archer.defend();
    }
}
