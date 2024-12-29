package idea.week3;

// Step 2: Implement the RemoteControl interface in the TV class
class TV implements RemoteControl {

    @Override
    public void powerOn() {
        System.out.println("TV is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is now OFF.");
    }
}


class AC implements RemoteControl {

    @Override
    public void powerOn() {
        System.out.println("AC is now ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("AC is now OFF.");
    }
}


public class Question6 {
    public static void main(String[] args) {
        // Create instances of TV and AC
        RemoteControl tv = new TV();
        RemoteControl ac = new AC();

        // Power on and off TV
        System.out.println("Testing TV:");
        tv.powerOn();
        tv.powerOff();

        // Power on and off AC
        System.out.println("\nTesting AC:");
        ac.powerOn();
        ac.powerOff();
    }
}
