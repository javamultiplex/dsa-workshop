package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.array.problems.ArraySwap;

/**
 * @author Rohit Agarwal on 21/01/21 11:18 pm
 * @copyright www.javamultiplex.com
 */
public class BubbleSort {

    //Time - O(n*n), Space - O(1)
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArraySwap.swap(arr, j, j + 1);
                }
            }
        }
    }
}
