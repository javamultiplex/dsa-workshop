package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 29/12/20 11:39 pm
 * @copyright www.javamultiplex.com
 */
public class MaximumSumOfKConsecutiveElements {

    //Time - O(n*k), Space - O(1)
    public static int method1(int[] arr, int n, int k) {
        int sum = 0, max = -1;
        for (int i = 0; i <= n - k; i++) {
            sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
