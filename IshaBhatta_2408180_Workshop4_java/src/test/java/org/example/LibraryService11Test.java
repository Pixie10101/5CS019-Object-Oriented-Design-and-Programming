package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import java.util.List;

public class LibraryService11Test {

    private LibraryService11 libraryService;

    @BeforeClass
    public static void setupClass() {
        System.out.println("Setting up global configuration...");
    }

    @AfterClass
    public static void teardownClass() {
        System.out.println("Cleaning up global resources...");
    }

    @BeforeEach
    public void setup() {
        libraryService = new LibraryService11();
        System.out.println("LibraryService object initialized.");
    }

    @AfterEach
    public void teardown() {
        System.out.println("Test completed. Resetting states if necessary.");
    }

    @Test
    public void testAddBook() {
        libraryService.addBook("The Great Gatsby");
        List<String> books = libraryService.getAllBooks();
        assertEquals(1, books.size(), "Book should be added to the library.");
        assertTrue(books.contains("The Great Gatsby"), "The added book should be present in the library.");
    }

    @Test
    public void testSearchBookByTitle() {
        libraryService.addBook("1984");
        String result = libraryService.searchBookByTitle("1984");
        assertNotNull(result, "Book should be found by title.");
        assertEquals("1984", result, "The correct book title should be returned.");
    }

    @Test
    public void testSearchBookNotFound() {
        String result = libraryService.searchBookByTitle("Nonexistent Book");
        assertNull(result, "Searching for a nonexistent book should return null.");
    }

    @Test
    public void testAddMultipleBooks() {
        libraryService.addBook("Moby Dick");
        libraryService.addBook("War and Peace");
        List<String> books = libraryService.getAllBooks();
        assertEquals(2, books.size(), "Two books should be added to the library.");
        assertTrue(books.contains("Moby Dick"), "Moby Dick should be in the library.");
        assertTrue(books.contains("War and Peace"), "War and Peace should be in the library.");
    }
}
