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
        double[] arr = {0.34, 0.22, 0.21, 0.89, 0.67};
        BucketSort.sort(arr);
        assertArrayEquals(new double[]{0.21, 0.22, 0.34, 0.67, 0.89}, arr);
        double[] brr = {0.12, 0.01, 0.17, 0.118};
        BucketSort.sort(brr);
        assertArrayEquals(new double[]{0.01, 0.118, 0.12, 0.17}, brr);
    }
}
