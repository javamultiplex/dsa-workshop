package com.javamultiplex.array.algorithms.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 09/01/21 10:26 pm
 * @copyright www.javamultiplex.com
 */
public class BinarySearchTest {

    @Test
    public void shouldSearch_recursive() {
        int index = BinarySearch.recursive(new int[]{1, 2, 3, 4, 5}, 5, 3);
        assertEquals(2, index);
        int index1 = BinarySearch.recursive(new int[]{1, 2, 3, 4, 5}, 5, 7);
        assertEquals(-1, index1);
        int index2 = BinarySearch.recursive(new int[]{1, 2, 3, 4, 5}, 5, 1);
        assertEquals(0, index2);
        int index3 = BinarySearch.recursive(new int[]{1, 2, 3, 4, 5}, 5, 2);
        assertEquals(1, index3);
        int index4 = BinarySearch.recursive(new int[]{1, 2, 3, 4, 5}, 5, 4);
        assertEquals(3, index4);
        int index5 = BinarySearch.recursive(new int[]{1, 2, 3, 4, 5}, 5, 5);
        assertEquals(4, index5);
    }

    @Test
    public void shouldSearch_iterative() {
        int index = BinarySearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 3);
        assertEquals(2, index);
        int index1 = BinarySearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 7);
        assertEquals(-1, index1);
        int index2 = BinarySearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 1);
        assertEquals(0, index2);
        int index3 = BinarySearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 2);
        assertEquals(1, index3);
        int index4 = BinarySearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 4);
        assertEquals(3, index4);
        int index5 = BinarySearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 5);
        assertEquals(4, index5);
    }
}
