package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.KadaneAlgorithm;

/**
 * @author Rohit Agarwal on 06/01/21 11:52 pm
 * @copyright www.javamultiplex.com
 */
public class LargestSumSubArray {

    //Time - O(n*n), Space - O(1)
    public static int method1(int[] arr, int n) {
        int sum, max = 0;
        for (int i = 0; i < n; i++) {
            sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    //Time - O(n), Space - O(1)
    public static int method2(int[] arr, int n) {
        return KadaneAlgorithm.getLargestSumSubArray(arr, n);
    }
}
