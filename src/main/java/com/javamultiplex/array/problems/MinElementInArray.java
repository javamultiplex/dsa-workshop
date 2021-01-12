package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 13/01/21 12:02 am
 * @copyright www.javamultiplex.com
 */
public class MinElementInArray {
    public static int find(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
