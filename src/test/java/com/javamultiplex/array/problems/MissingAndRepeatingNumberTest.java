package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 02/02/21 11:23 pm
 * @copyright www.javamultiplex.com
 */
public class MissingAndRepeatingNumberTest {

    @Test
    public void shouldFindMissingAndRepeatingNumber_method1() {
        int[] output = MissingAndRepeatingNumber.method1(new int[]{2, 3, 2, 1, 5}, 5);
        assertArrayEquals(new int[]{4, 2}, output);

        int[] output1 = MissingAndRepeatingNumber.method1(new int[]{1, 3, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{2, 3}, output1);

        int[] output2 = MissingAndRepeatingNumber.method1(new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{0, 0}, output2);
    }

    @Test
    public void shouldFindMissingAndRepeatingNumber_method2() {
        int[] output = MissingAndRepeatingNumber.method2(new int[]{2, 3, 2, 1, 5}, 5);
        assertArrayEquals(new int[]{4, 2}, output);

        int[] output1 = MissingAndRepeatingNumber.method2(new int[]{1, 3, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{2, 3}, output1);

        int[] output2 = MissingAndRepeatingNumber.method2(new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{0, 0}, output2);
    }

    @Test
    public void shouldFindMissingAndRepeatingNumber_method3() {
        int[] output = MissingAndRepeatingNumber.method3(new int[]{2, 3, 2, 1, 5}, 5);
        assertArrayEquals(new int[]{4, 2}, output);

        int[] output1 = MissingAndRepeatingNumber.method3(new int[]{1, 3, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{2, 3}, output1);

        int[] output2 = MissingAndRepeatingNumber.method3(new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{0, 0}, output2);
    }
}
