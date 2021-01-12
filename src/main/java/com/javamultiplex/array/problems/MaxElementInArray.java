package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 12/01/21 11:05 pm
 * @copyright www.javamultiplex.com
 */
public class MaxElementInArray {

    public static int find(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
