package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 30/12/20 11:57 pm
 * @copyright www.javamultiplex.com
 */
public class PrefixSumArrayTest {

    @Test
    public void shouldTestMethod1() {
        int[] result1 = PrefixSumArray.method1(new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{1, 3, 6, 10, 15}, result1);
        int[] result2 = PrefixSumArray.method1(new int[]{10, 200, 30, 400}, 4);
        assertArrayEquals(new int[]{10, 210, 240, 640}, result2);
        int[] result3 = PrefixSumArray.method1(new int[]{10, 20, 30, 40, 50}, 5);
        assertArrayEquals(new int[]{10, 30, 60, 100, 150}, result3);
    }
}
