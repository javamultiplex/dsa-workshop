package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 16/01/21 5:21 pm
 * @copyright www.javamultiplex.com
 */
public class InsertionSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {5, 4, 3, 2, 1};
        InsertionSort.sort(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        int[] brr = {4, 5, 10, 1, 6, 2};
        InsertionSort.sort(brr, 6);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, brr);
    }
}
