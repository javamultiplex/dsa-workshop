package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.searching.BinarySearch;

/**
 * @author Rohit Agarwal on 09/01/21 10:14 pm
 * @copyright www.javamultiplex.com
 */
public class TransitionPointFinder {
    public static int transitionPoint(int[] arr, int n) {
        int index = BinarySearch.iterative(arr, n, 1);
        if (index == -1) {
            return index;
        } else {
            int i;
            for (i = index; i > 0; i--) {
                if (arr[i - 1] == 0) {
                    break;
                }
            }
            return i;
        }
    }
}
