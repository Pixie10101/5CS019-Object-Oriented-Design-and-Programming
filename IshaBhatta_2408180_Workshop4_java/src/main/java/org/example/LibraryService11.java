package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibraryService11 {

    private List<String> books;

    public LibraryService11() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
    }

    public String searchBookByTitle(String title) {
        for (String book : books) {
            if (book.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;  // Return null if book not found
    }

    public List<String> getAllBooks() {
        return new ArrayList<>(books);  // Returns a copy of the list to avoid modification outside
    }
}

