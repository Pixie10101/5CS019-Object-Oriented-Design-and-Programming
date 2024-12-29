class Book {
    // Instance variables
    private String title;
    private String author;
    private int year;

    // Constructor to initialize the fields
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Override the toString() method to return a formatted string representation of a Book object
    @Override
    public String toString() {
        return "Book Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year of Publication: " + year;
    }
}

//Main class to test the Book class and toString() method


public class Question16 {

    public static void main(String[] args) {
        // Create a Book object using the constructor
        Book book1 = new Book("1984", "George Orwell", 1949);

        // Display the book details using the overridden toString() method
        System.out.println(book1);

    }

}