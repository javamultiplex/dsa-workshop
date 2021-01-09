package com.javamultiplex.array.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 09/01/21 10:26 pm
 * @copyright www.javamultiplex.com
 */
public class BinarySearchAlgorithmTest {

    @Test
    public void shouldSearch_recursive() {
        int index = BinarySearchAlgorithm.recursive(new int[]{1, 2, 3, 4, 5}, 5, 3);
        assertEquals(2, index);
        int index1 = BinarySearchAlgorithm.recursive(new int[]{1, 2, 3, 4, 5}, 5, 7);
        assertEquals(-1, index1);
        int index2 = BinarySearchAlgorithm.recursive(new int[]{1, 2, 3, 4, 5}, 5, 1);
        assertEquals(0, index2);
        int index3 = BinarySearchAlgorithm.recursive(new int[]{1, 2, 3, 4, 5}, 5, 2);
        assertEquals(1, index3);
        int index4 = BinarySearchAlgorithm.recursive(new int[]{1, 2, 3, 4, 5}, 5, 4);
        assertEquals(3, index4);
        int index5 = BinarySearchAlgorithm.recursive(new int[]{1, 2, 3, 4, 5}, 5, 5);
        assertEquals(4, index5);
    }

    @Test
    public void shouldSearch_iterative() {
        int index = BinarySearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 3);
        assertEquals(2, index);
        int index1 = BinarySearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 7);
        assertEquals(-1, index1);
        int index2 = BinarySearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 1);
        assertEquals(0, index2);
        int index3 = BinarySearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 2);
        assertEquals(1, index3);
        int index4 = BinarySearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 4);
        assertEquals(3, index4);
        int index5 = BinarySearchAlgorithm.iterative(new int[]{1, 2, 3, 4, 5}, 5, 5);
        assertEquals(4, index5);
    }
}
