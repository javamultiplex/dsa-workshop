package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 07/02/21 10:40 pm
 * @copyright www.javamultiplex.com
 */
public class CountingSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {4, 2, 1, 1, 3, 3, 3, 5};
        CountingSort.sort(arr, 8);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 3, 4, 5}, arr);
        int[] brr = {10, 3, 4, 5, 6, 1, 2, 2};
        CountingSort.sort(brr, 8);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6, 10}, brr);
        int[] crr = {4, 3, 9, 100};
        CountingSort.sort(crr, 4);
        assertArrayEquals(new int[]{3, 4, 9, 100}, crr);
    }
}
