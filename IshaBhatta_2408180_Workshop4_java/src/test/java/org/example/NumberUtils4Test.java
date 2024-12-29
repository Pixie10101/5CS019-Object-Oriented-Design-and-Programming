package org.example;

import static org.junit.jupiter.api.Assertions.*;

// JUnit Test Case
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class NumberUtils4Test {

    @Test
    public void testGetEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        List<Integer> expectedOutput = Arrays.asList(2, 4, 6);

        List<Integer> result = NumberUtils4.getEvenNumbers(input);

        assertEquals(expectedOutput, result, "The method should return only even numbers from the input array.");
    }

    @Test
    public void testGetEvenNumbersEmptyInput() {
        int[] input = {};
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> result = NumberUtils4.getEvenNumbers(input);

        assertEquals(expectedOutput, result, "The method should return an empty list for an empty input array.");
    }

    @Test
    public void testGetEvenNumbersNoEvens() {
        int[] input = {1, 3, 5, 7};
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> result = NumberUtils4.getEvenNumbers(input);

        assertEquals(expectedOutput, result, "The method should return an empty list if there are no even numbers.");
    }

    @Test
    public void testGetEvenNumbersAllEvens() {
        int[] input = {2, 4, 6, 8};
        List<Integer> expectedOutput = Arrays.asList(2, 4, 6, 8);

        List<Integer> result = NumberUtils4.getEvenNumbers(input);

        assertEquals(expectedOutput, result, "The method should return all numbers if they are all even.");
    }
}
