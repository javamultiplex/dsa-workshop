package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 09/01/21 7:27 pm
 * @copyright www.javamultiplex.com
 */
public class MergeTwoSortedArraysTest {

    @Test
    public void shouldMergeTwoArrays() {
        int[] result = MergeTwoSortedArrays.method1(new int[]{1, 3, 4, 6}, new int[]{2, 5, 7, 8}, 4, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, result);

        int[] result1 = MergeTwoSortedArrays.method1(new int[]{1, 2, 7}, new int[]{8, 9, 17}, 3, 3);
        assertArrayEquals(new int[]{1, 2, 7, 8, 9, 17}, result1);
    }
}
