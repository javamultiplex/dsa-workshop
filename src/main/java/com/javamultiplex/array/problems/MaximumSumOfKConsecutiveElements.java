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

    //Time - O(n), Space - O(1)
    //Sliding window technique
    public static int method2(int[] arr, int n, int k) {
        int windowSum = 0;
        if (k > n) {
            return -1;
        }
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for (int i = 1; i <= n - k; i++) {
            windowSum = windowSum - arr[i - 1] + arr[i + k - 1];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return maxSum;
    }
}
