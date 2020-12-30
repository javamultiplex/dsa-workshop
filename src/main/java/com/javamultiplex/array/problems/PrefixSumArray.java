package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 30/12/20 11:54 pm
 * @copyright www.javamultiplex.com
 */
public class PrefixSumArray {
    //Time - O(n), Space - O(1)
    public static int[] method1(int[] arr, int n) {
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }
        return prefixSum;
    }
}
