package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 07/02/21 3:27 pm
 * @copyright www.javamultiplex.com
 */
public class RadixSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        RadixSort.sort(arr, 8);
        assertArrayEquals(new int[]{2, 24, 45, 66, 75, 90, 170, 802}, arr);
        int[] brr = {4, 5, 10, 1, 6, 2};
        RadixSort.sort(brr, 6);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, brr);
        int[] crr = {10, 20, 30, 40, 1, 2, 3, 4};
        RadixSort.sort(crr, 8);
        assertArrayEquals(new int[]{1, 2, 3, 4, 10, 20, 30, 40}, crr);
        int[] drr = {12, 11, 13, 5, 6, 7};
        RadixSort.sort(drr, 6);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, drr);
        int[] err = {5, 4, 3, 2, 1};
        RadixSort.sort(err, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, err);
    }
}
