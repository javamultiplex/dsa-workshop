package com.javamultiplex.array.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 27/12/20 4:18 pm
 * @copyright www.javamultiplex.com
 */
public class JugglingAlgorithmTest {

    @Test
    public void shouldLeftRotate() {
        int[] arr = {1, 2, 3, 4, 5};
        JugglingAlgorithm.leftRotate(arr, 5, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);

        int[] brr = {1, 2, 3, 4, 5};
        JugglingAlgorithm.leftRotate(brr, 5, 4);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, brr);

        int[] crr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        JugglingAlgorithm.leftRotate(crr, 12, 3);
        assertArrayEquals(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3}, crr);
    }
}
