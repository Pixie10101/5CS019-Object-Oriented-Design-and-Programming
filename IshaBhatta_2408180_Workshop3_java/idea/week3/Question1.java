package idea.week3;

public class Question1 {
    private int id;
    private String name;
    private int age;
    private char grade;


    public Question1(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Question1() {

    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for grade
    public char getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(char grade) {
        this.grade = grade;
    }


    public static void main(String[] args) {
        Question1 student = new Question1();


        student.setName("IshaBhatta");
        student.setAge(16);
        student.setGrade('A');



        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());


    }

    }

