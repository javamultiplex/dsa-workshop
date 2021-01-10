package com.javamultiplex.array.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 10/01/21 7:01 pm
 * @copyright www.javamultiplex.com
 */
public class LinearSearchAlgorithmTest {
    @Test
    public void shouldSearch_iterative() {
        int index = LinearSearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 3);
        assertEquals(2, index);
        int index1 = LinearSearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 7);
        assertEquals(-1, index1);
        int index2 = LinearSearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 1);
        assertEquals(0, index2);
        int index3 = LinearSearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 2);
        assertEquals(1, index3);
        int index4 = LinearSearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 4);
        assertEquals(3, index4);
        int index5 = LinearSearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 5);
        assertEquals(4, index5);
    }
}
