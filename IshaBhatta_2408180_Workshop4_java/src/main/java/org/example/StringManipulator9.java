package org.example;

public class StringManipulator9 {

    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public String toUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }

    public int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        return (int) input.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
    }
}

