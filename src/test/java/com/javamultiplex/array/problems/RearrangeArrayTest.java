package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 16/01/21 2:29 pm
 * @copyright www.javamultiplex.com
 */
public class RearrangeArrayTest {

    @Test
    public void shouldRearrangeArray_method1() {
        long[] arr = {1, 0};
        RearrangeArray.method1(arr, 2);
        assertArrayEquals(new long[]{0, 1}, arr);
        long[] brr = {4, 0, 2, 1, 3};
        RearrangeArray.method1(brr, 5);
        assertArrayEquals(new long[]{3, 4, 2, 0, 1}, brr);
    }

    @Test
    public void shouldRearrangeArray_method2() {
        long[] arr = {1, 0};
        RearrangeArray.method2(arr, 2);
        assertArrayEquals(new long[]{0, 1}, arr);
        long[] brr = {4, 0, 2, 1, 3};
        RearrangeArray.method2(brr, 5);
        assertArrayEquals(new long[]{3, 4, 2, 0, 1}, brr);
    }
}
