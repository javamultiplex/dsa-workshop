package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 07/02/21 3:27 pm
 * @copyright www.javamultiplex.com
 */
public class BucketSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        BucketSort.sort(arr);
        assertArrayEquals(new int[]{2, 24, 45, 66, 75, 90, 170, 802}, arr);
        int[] brr = {4, 5, 10, 1, 6, 2};
        BucketSort.sort(brr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, brr);
        int[] crr = {10, 20, 30, 40, 1, 2, 3, 4};
        BucketSort.sort(crr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 10, 20, 30, 40}, crr);
        int[] drr = {12, 11, 13, 5, 6, 7};
        BucketSort.sort(drr);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, drr);
        int[] err = {5, 4, 3, 2, 1};
        BucketSort.sort(err);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, err);
    }
}
