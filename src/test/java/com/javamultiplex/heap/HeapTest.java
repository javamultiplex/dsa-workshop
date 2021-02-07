package com.javamultiplex.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 06/02/21 10:52 pm
 * @copyright www.javamultiplex.com
 */
public class HeapTest {
    @Test
    public void shouldBuildMaxHeap() {
        int[] arr = {1, 2, 4, 5, 6, 10};
        Heap.buildMaxHeap(arr, 6);
        Assertions.assertArrayEquals(new int[]{10, 6, 4, 5, 2, 1}, arr);
        int[] brr = {5, 6, 7, 11, 12, 13};
        Heap.buildMaxHeap(brr, 6);
        Assertions.assertArrayEquals(new int[]{13, 12, 7, 11, 6, 5}, brr);
    }

    @Test
    public void shouldBuildMinHeap() {
        int[] arr = {10, 6, 5, 4, 2, 1};
        Heap.buildMinHeap(arr, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 5, 4, 6, 10}, arr);
        int[] brr = {13, 12, 11, 7, 6, 5};
        Heap.buildMinHeap(brr, 6);
        Assertions.assertArrayEquals(new int[]{5, 6, 11, 7, 12, 13}, brr);
    }
}
