package com.javamultiplex.array.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 20/02/21 5:38 pm
 * @copyright www.javamultiplex.com
 */
public class ShellSortTest {

    @Test
    public void shouldSort() {
        int[] arr = {23, 29, 15, 19, 31, 7, 9, 5, 2};
        ShellSort.sort(arr);
        assertArrayEquals(new int[]{2, 5, 7, 9, 15, 19, 23, 29, 31}, arr);
        int[] brr = {5, 4, 3, 2, 1};
        ShellSort.sort(brr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, brr);
        int[] crr = {4, 5, 10, 1, 6, 2};
        ShellSort.sort(crr);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 10}, crr);
        int[] drr = {10, 20, 30, 40, 1, 2, 3, 4};
        ShellSort.sort(drr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 10, 20, 30, 40}, drr);
    }
}
