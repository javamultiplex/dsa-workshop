package com.javamultiplex.array;

/**
 * @author Rohit Agarwal on 25/12/20 11:51 pm
 * @copyright www.javamultiplex.com
 */
public class TrappingRainWater {
    //O(n^2)
    public static int maxWater(int[] arr, int n) {
        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = leftMax(arr, i);
            int right = rightMax(arr, i, n);
            result = result + Math.min(left, right) - arr[i];
        }
        return result;
    }

    private static int rightMax(int[] arr, int i, int n) {
        int max = 0;
        for (int j = i; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }

    private static int leftMax(int[] arr, int i) {
        int max = 0;
        for (int j = i; j >= 0; j--) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }
}
