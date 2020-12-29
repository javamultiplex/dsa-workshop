package com.javamultiplex.array.algorithms;

import com.javamultiplex.array.problems.ArrayLeftRotation;
import com.javamultiplex.array.problems.ArrayRightRotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 29/12/20 11:04 pm
 * @copyright www.javamultiplex.com
 */
public class ReversalAlgorithmTest {

    @Test
    public void shouldLeftRotate() {
        int[] arr = {1, 2, 3, 4, 5};
        ReversalAlgorithm.leftRotate(arr, 5, 2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr);

        int[] brr = {1, 2, 3, 4, 5};
        ReversalAlgorithm.leftRotate(brr, 5, 4);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, brr);
    }

    @Test
    public void shouldRightRotate() {
        int[] arr = {1, 2, 3, 4, 5};
        ReversalAlgorithm.rightRotate(arr, 5, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);

        int[] brr = {1, 2, 3, 4, 5};
        ReversalAlgorithm.rightRotate(brr, 5, 4);
        assertArrayEquals(new int[]{2, 3, 4, 5, 1}, brr);
    }
}
