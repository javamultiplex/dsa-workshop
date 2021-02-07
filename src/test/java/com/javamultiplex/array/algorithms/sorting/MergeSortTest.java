package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 23/01/21 11:59 pm
 * @copyright www.javamultiplex.com
 */
public class MergeSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {5, 4, 3, 2, 1};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        int[] brr = {4, 5, 10, 1, 6, 2};
        MergeSort.sort(brr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, brr);
        int[] crr = {10, 20, 30, 40, 1, 2, 3, 4};
        MergeSort.sort(crr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 10, 20, 30, 40}, crr);
    }
}
