package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils4 {

    public static List<Integer> getEvenNumbers(int[] numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}