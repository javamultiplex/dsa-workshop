package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 10/01/21 11:08 am
 * @copyright www.javamultiplex.com
 */

import com.javamultiplex.array.algorithms.searching.LinearSearch;

/**
 * Given an array arr[] of size N, find the first repeating element.
 * The element should occurs more than once and the index of its first occurrence should be the smallest.
 */
public class FirstRepeatingElement {
    //Time - O(nlogn), Space - O(1)
    public static int firstRepeated(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int index = LinearSearch.iterative(arr, i + 1, n - 1, arr[i]);
            if (index != -1) {
                if (i < min) {
                    min = i;
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        } else {
            return min + 1;
        }
    }
}
