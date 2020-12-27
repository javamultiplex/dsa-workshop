package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 27/12/20 5:39 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayRightRotationTest {
    @Test
    public void shouldTestMethod1() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayRightRotation.method1(arr, 5, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);

        int[] brr = {1, 2, 3, 4, 5};
        ArrayRightRotation.method1(brr, 5, 4);
        assertArrayEquals(new int[]{2, 3, 4, 5, 1}, brr);
    }
}
