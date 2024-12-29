package idea.week3;

    // Define the abstract class
    abstract class Question3 {
        // Abstract methods
        public abstract void startEngine();
        public abstract void stopEngine();
    }

    // Define the Car class that extends Vehicle
    class Car extends Question3  {
        @Override
        public void startEngine() {
            System.out.println("Car engine started with a key turn.");
        }

        @Override
        public void stopEngine() {
            System.out.println("Car engine stopped by turning the key off.");
        }
    }

    // Define the Motorcycle class that extends Vehicle
    class Motorcycle extends Question3 {
        @Override
        public void startEngine() {
            System.out.println("Motorcycle engine started with a kickstart.");
        }

        @Override
        public void stopEngine() {
            System.out.println("Motorcycle engine stopped with the kill switch.");
        }
    }

    // Main class to demonstrate functionality
    class Main {
        public static void main(String[] args) {
            // Create instances of Car and Motorcycle
            Question3 car = new Car();
            Question3 motorcycle = new Motorcycle();

            // Start and stop engines for Car
            car.startEngine();
            car.stopEngine();

            // Start and stop engines for Motorcycle
            motorcycle.startEngine();
            motorcycle.stopEngine();
        }
    }


