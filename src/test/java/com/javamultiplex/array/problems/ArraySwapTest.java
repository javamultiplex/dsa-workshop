package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 21/01/21 11:33 pm
 * @copyright www.javamultiplex.com
 */
public class ArraySwapTest {

    @Test
    public void shouldSwap() {
        int[] arr = {1, 4, 5, 6, 3};
        ArraySwap.swap(arr, 2, 4);
        assertArrayEquals(new int[]{1, 4, 3, 6, 5}, arr);
    }
}
