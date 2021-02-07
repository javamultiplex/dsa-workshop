package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 21/01/21 11:03 pm
 * @copyright www.javamultiplex.com
 */
public class SelectionSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        int[] brr = {4, 5, 10, 1, 6, 2};
        SelectionSort.sort(brr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, brr);
        int[] crr = {4, 5, 10, 1, 6, 12, 89, 11, 14, 91};
        SelectionSort.sort(crr);
        assertArrayEquals(new int[]{1, 4, 5, 6, 10, 11, 12, 14, 89, 91}, crr);
    }
}
