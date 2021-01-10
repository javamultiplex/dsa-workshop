package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 10/01/21 7:32 pm
 * @copyright www.javamultiplex.com
 */

/**
 * Given an array arr[] of size N containing positive integers and an integer X,
 * find the element in the array which is smaller than X and closest to it.
 */
public class ImmediateSmaller {
    public static int immediateSmaller(int[] arr, int n, int x) {
        int distance, min = Integer.MAX_VALUE, j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                distance = Math.abs(x - arr[i]);
                if (distance < min) {
                    min = distance;
                    j = i;
                }
            }
        }

        if (j == -1) {
            return -1;
        } else {
            return arr[j];
        }
    }
}
