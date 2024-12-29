
final class FinalClass {
    public void display() {
        System.out.println("This is a method in the FinalClass.");
    }
}

// Attempt to extend the final class
// This will cause a compiler error
/*
class SubClass extends FinalClass {
    // Compilation Error: Cannot inherit from final 'FinalClass'
}
*/


class ParentClass {
    public final void finalMethod() {
        System.out.println("This is a final method in ParentClass.");
    }
}


class ChildClass extends ParentClass {
    // Attempt to override final method
    /*
    @Override
    public void finalMethod() {
        // Compilation Error: Cannot override the final method from ParentClass
        System.out.println("Attempting to override a final method.");
    }
    */
    public void anotherMethod() {
        System.out.println("This is a non-final method in ChildClass.");
    }
}


public class Question6 {
    public static void main(String[] args) {
        // Final class demonstration
        FinalClass finalObj = new FinalClass();
        finalObj.display();

        // Final method demonstration
        ChildClass child = new ChildClass();
        child.finalMethod(); // Inherited from ParentClass
        child.anotherMethod();
    }
}
