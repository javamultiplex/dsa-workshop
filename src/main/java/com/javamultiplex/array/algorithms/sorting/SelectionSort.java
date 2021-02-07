package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.array.problems.ArraySwap;

/**
 * @author Rohit Agarwal on 21/01/21 10:58 pm
 * @copyright www.javamultiplex.com
 */
public class SelectionSort {


    //Time - O(n*n), Space - O(1)
    public static void sort(int[] arr) {
        int n = arr.length;
        int min, k;
        for (int i = 0; i < n; i++) {
            min = Integer.MAX_VALUE;
            k = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    k = j;
                }
            }
            ArraySwap.swap(arr, i, k);
        }
    }


}
