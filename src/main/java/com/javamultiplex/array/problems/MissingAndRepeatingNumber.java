package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.searching.BinarySearch;
import com.javamultiplex.array.algorithms.sorting.QuickSort;

/**
 * @author Rohit Agarwal on 02/02/21 10:25 pm
 * @copyright www.javamultiplex.com
 */
public class MissingAndRepeatingNumber {

    //Time - O(nlog(n)), Space - O(1)
    public static int[] method1(int[] arr, int n) {
        int[] output = new int[2];
        QuickSort.sort(arr, n);
        for (int i = 1; i <= n; i++) {
            int index = BinarySearch.iterative(arr, n, i);
            if (index == -1) {
                output[0] = i;
                break;
            }
        }
        for (int i = 1; i <= n; i++) {
            int count = FrequencyOfNumber.method1(arr, i);
            if (count > 1) {
                output[1] = i;
                break;
            }
        }
        return output;
    }
}
