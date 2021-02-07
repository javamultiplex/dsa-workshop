package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.array.problems.MaxElementInArray;

/**
 * @author Rohit Agarwal on 07/02/21 10:34 pm
 * @copyright www.javamultiplex.com
 */
public class CountingSort {

    /**
     * Time - O(n+k)
     * Space - O(k)
     * Where K=max element in an array
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        int max = MaxElementInArray.find(arr, n);
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] != 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
    }
}
