package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 27/12/20 3:38 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayReversalTest {

    @Test
    public void shouldReverse_oddSizeArray() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayReversal.reverse(arr, 0, 2);
        Assertions.assertArrayEquals(new int[]{2, 1, 3, 4, 5}, arr);
        ArrayReversal.reverse(arr, 2, 5);
        Assertions.assertArrayEquals(new int[]{2, 1, 5, 4, 3}, arr);
        ArrayReversal.reverse(arr, 0, 5);
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);
    }

    @Test
    public void shouldReverse_evenSizeArray() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayReversal.reverse(arr, 0, 2);
        Assertions.assertArrayEquals(new int[]{2, 1, 3, 4, 5, 6}, arr);
        ArrayReversal.reverse(arr, 2, 6);
        Assertions.assertArrayEquals(new int[]{2, 1, 6, 5, 4, 3}, arr);
        ArrayReversal.reverse(arr, 0, 6);
        Assertions.assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, arr);
    }
}
