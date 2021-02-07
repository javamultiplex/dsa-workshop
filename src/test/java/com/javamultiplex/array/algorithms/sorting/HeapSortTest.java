package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 06/02/21 6:57 pm
 * @copyright www.javamultiplex.com
 */
public class HeapSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {5, 4, 3, 2, 1};
        HeapSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
        int[] brr = {4, 5, 10, 1, 6, 2};
        HeapSort.sort(brr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, brr);
        int[] crr = {10, 20, 30, 40, 1, 2, 3, 4};
        HeapSort.sort(crr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 10, 20, 30, 40}, crr);
        int[] drr = {12, 11, 13, 5, 6, 7};
        HeapSort.sort(drr);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, drr);

    }
}
