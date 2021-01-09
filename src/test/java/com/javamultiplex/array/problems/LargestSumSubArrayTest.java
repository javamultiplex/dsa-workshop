package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 06/01/21 11:58 pm
 * @copyright www.javamultiplex.com
 */
public class LargestSumSubArrayTest {

    @Test
    public void shouldGetLargestSumSubArray_method1() {
        int result = LargestSumSubArray.method1(new int[]{-3, 4, -1, -2, 1, 5}, 6);
        assertEquals(7, result);
        int result1 = LargestSumSubArray.method1(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}, 8);
        assertEquals(7, result1);
        int result2 = LargestSumSubArray.method1(new int[]{1, 5, -4, -3, 8, 3}, 6);
        assertEquals(11, result2);
    }

    @Test
    public void shouldGetLargestSumSubArray_method2() {
        int result = LargestSumSubArray.method2(new int[]{-3, 4, -1, -2, 1, 5}, 6);
        assertEquals(7, result);
        int result1 = LargestSumSubArray.method2(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}, 8);
        assertEquals(7, result1);
        int result2 = LargestSumSubArray.method2(new int[]{1, 5, -4, -3, 8, 3}, 6);
        assertEquals(11, result2);
    }
}
