package com.javamultiplex.array.algorithms.searching;

/**
 * @author Rohit Agarwal on 10/01/21 6:58 pm
 * @copyright www.javamultiplex.com
 */
public class LinearSearchAlgorithm {

    //Time - O(n), Space - O(1)
    public static int iterative(int[] arr, int n, int numberToSearch) {
        return iterative(arr, 0, n - 1, numberToSearch);
    }

    public static int iterative(int[] arr, int left, int right, int numberToSearch) {
        for (int i = left; i <= right; i++) {
            if (arr[i] == numberToSearch) {
                return i;
            }
        }
        return -1;
    }
}
