package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 04/01/21 10:34 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayRangeSum {
    //Time - O(n), Space - O(n)
    public static int get(int[] arr, int n, int i, int j) {
        int[] output = PrefixSumArray.method1(arr, n);
        if (i < 0 || j >= n) {
            return -1;
        } else if (i == 0) {
            return output[j];
        } else {
            return output[j] - output[i - 1];
        }
    }
}
