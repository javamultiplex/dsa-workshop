package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.array.problems.ArraySwap;

/**
 * @author Rohit Agarwal on 20/02/21 5:26 pm
 * @copyright www.javamultiplex.com
 */
public class ShellSort {

    //Time - O(n*n), Space - O(1)
    public static void sort(int[] arr) {
        int n = arr.length, i, j, k;
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            i = 0;
            j = i + gap;
            while (j <= n - 1) {
                if (arr[i] > arr[j]) {
                    ArraySwap.swap(arr, i, j);
                    k = i - gap;
                    while (k >= 0 && arr[k] > arr[i]) {
                        ArraySwap.swap(arr, k, i);
                        k = k - gap;
                    }
                }
                i++;
                j = i + gap;
            }
        }
    }
}
