package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 24/01/21 10:11 pm
 * @copyright www.javamultiplex.com
 */
public class QuickSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        int[] brr = {4, 5, 10, 1, 6, 2};
        QuickSort.sort(brr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, brr);
        int[] crr = {10, 20, 30, 40, 1, 2, 3, 4};
        QuickSort.sort(crr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 10, 20, 30, 40}, crr);
    }
}
