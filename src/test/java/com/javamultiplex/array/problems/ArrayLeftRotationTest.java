package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 27/12/20 3:19 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayLeftRotationTest {
    @Test
    public void shouldTestMethod1() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayLeftRotation.method1(arr, 5, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);

        int[] brr = {1, 2, 3, 4, 5};
        ArrayLeftRotation.method1(brr, 5, 4);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, brr);
    }

    @Test
    public void shouldTestMethod2() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayLeftRotation.method2(arr, 5, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);

        int[] brr = {1, 2, 3, 4, 5};
        ArrayLeftRotation.method2(brr, 5, 4);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, brr);
    }

    @Test
    public void shouldTestMethod3() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayLeftRotation.method3(arr, 5, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);

        int[] brr = {1, 2, 3, 4, 5};
        ArrayLeftRotation.method3(brr, 5, 4);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, brr);
    }
}
