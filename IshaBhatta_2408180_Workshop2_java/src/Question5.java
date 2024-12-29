
class Parent {
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";


    public String getPrivateVar() {
        return privateVar;
    }
}

class Child extends Parent {


    public void displayVariables() {
        System.out.println("Accessing privateVar via getter: " + getPrivateVar());
        System.out.println("Accessing protectedVar: " + protectedVar);
        System.out.println("Accessing publicVar: " + publicVar);
    }
}


public class Question5 {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayVariables();
    }
}
