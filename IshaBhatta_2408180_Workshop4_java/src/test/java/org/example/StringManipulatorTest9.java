package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest9 {

    @Test
    public void testStringManipulatorMethods() {
        StringManipulator9 manipulator = new StringManipulator9();

        assertAll("StringManipulator Tests",
                // Test reverse method
                () -> assertEquals("cba", manipulator.reverse("abc"),
                        "The reverse method should return the reversed string."),
                () -> assertNull(manipulator.reverse(null),
                        "The reverse method should return null for null input."),

                // Test toUpperCase method
                () -> assertEquals("HELLO", manipulator.toUpperCase("hello"),
                        "The toUpperCase method should return the string in uppercase."),
                () -> assertNull(manipulator.toUpperCase(null),
                        "The toUpperCase method should return null for null input."),

                // Test isPalindrome method
                () -> assertTrue(manipulator.isPalindrome("madam"),
                        "The isPalindrome method should return true for a palindrome string."),
                () -> assertFalse(manipulator.isPalindrome("hello"),
                        "The isPalindrome method should return false for a non-palindrome string."),
                () -> assertFalse(manipulator.isPalindrome(null),
                        "The isPalindrome method should return false for null input."),

                // Test countVowels method
                () -> assertEquals(5, manipulator.countVowels("education"),
                        "The countVowels method should correctly count vowels in the string."),
                () -> assertEquals(0, manipulator.countVowels("rhythm"),
                        "The countVowels method should return 0 if there are no vowels in the string."),
                () -> assertEquals(0, manipulator.countVowels(null),
                        "The countVowels method should return 0 for null input.")
        );
    }
}
