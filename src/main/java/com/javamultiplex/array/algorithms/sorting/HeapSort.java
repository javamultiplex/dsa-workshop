package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.heap.Heap;

/**
 * @author Rohit Agarwal on 06/02/21 6:54 pm
 * @copyright www.javamultiplex.com
 */
public class HeapSort {

    //Time - O(nlog(n))
    public static void sort(int[] arr, int n) {
        Heap.buildMaxHeap(arr, n);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            Heap.maxHeapify(arr, i, 0);
        }
    }
}
