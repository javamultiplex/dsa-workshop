package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.LinearSearchAlgorithm;

/**
 * @author Rohit Agarwal on 10/01/21 8:03 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestPositiveMissingNumber {

    //Time - O(n*n), Space - O(1)
    public static int method1(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr[j++] = arr[i];
            }
        }

        int min = min(arr, j);
        int max = max(arr, j);

        for (int i = min; i <= max; i++) {
            int index = LinearSearchAlgorithm.iterative(arr, j, i);
            if (index == -1) {
                return i;
            }
        }
        return max + 1;
    }

    private static int min(int[] arr, int n) {
        int min = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int max(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
