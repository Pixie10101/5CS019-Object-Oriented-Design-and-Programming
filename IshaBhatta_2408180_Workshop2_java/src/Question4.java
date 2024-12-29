
class Person {
    protected String address;


    public Person(String address) {
        this.address = address;
    }


    public String getAddress() {
        return address;
    }
}

class Employee extends Person {
    private String department;


    public Employee(String address, String department) {
        super(address);
        this.department = department;
    }


    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
    }
}


public class Question4 {
    public static void main(String[] args) {
        Employee employee = new Employee("Suryabinayak, Bhaktapur", "IT");


        employee.displayInfo();
    }
}
