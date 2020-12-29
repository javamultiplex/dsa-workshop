package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 27/12/20 3:38 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayReversalTest {

    @Test
    public void shouldReverse_oddSizeArray_iterative() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayReversal.method1(arr, 0, 1);
        Assertions.assertArrayEquals(new int[]{2, 1, 3, 4, 5}, arr);
        ArrayReversal.method1(arr, 2, 4);
        Assertions.assertArrayEquals(new int[]{2, 1, 5, 4, 3}, arr);
        ArrayReversal.method1(arr, 0, 4);
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
    }

    @Test
    public void shouldReverse_evenSizeArray_iterative() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayReversal.method1(arr, 0, 1);
        Assertions.assertArrayEquals(new int[]{2, 1, 3, 4, 5, 6}, arr);
        ArrayReversal.method1(arr, 2, 5);
        Assertions.assertArrayEquals(new int[]{2, 1, 6, 5, 4, 3}, arr);
        ArrayReversal.method1(arr, 0, 5);
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, arr);
    }

    @Test
    public void shouldReverse_oddSizeArray_recursive() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayReversal.method2(arr, 0, 1);
        Assertions.assertArrayEquals(new int[]{2, 1, 3, 4, 5}, arr);
        ArrayReversal.method2(arr, 2, 4);
        Assertions.assertArrayEquals(new int[]{2, 1, 5, 4, 3}, arr);
        ArrayReversal.method2(arr, 0, 4);
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
    }

    @Test
    public void shouldReverse_evenSizeArray_recursive() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayReversal.method2(arr, 0, 1);
        Assertions.assertArrayEquals(new int[]{2, 1, 3, 4, 5, 6}, arr);
        ArrayReversal.method2(arr, 2, 5);
        Assertions.assertArrayEquals(new int[]{2, 1, 6, 5, 4, 3}, arr);
        ArrayReversal.method2(arr, 0, 5);
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, arr);
    }
}
