package com.javamultiplex.array.algorithms.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 10/01/21 7:01 pm
 * @copyright www.javamultiplex.com
 */
public class LinearSearchTest {
    @Test
    public void shouldSearch_iterative() {
        int index = LinearSearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 3);
        assertEquals(2, index);
        int index1 = LinearSearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 7);
        assertEquals(-1, index1);
        int index2 = LinearSearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 1);
        assertEquals(0, index2);
        int index3 = LinearSearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 2);
        assertEquals(1, index3);
        int index4 = LinearSearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 4);
        assertEquals(3, index4);
        int index5 = LinearSearch.iterative(new int[]{1, 2, 3, 4, 5}, 5, 5);
        assertEquals(4, index5);
    }
}
