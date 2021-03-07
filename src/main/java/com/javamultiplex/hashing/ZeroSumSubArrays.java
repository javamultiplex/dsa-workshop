package com.javamultiplex.hashing;

/**
 * @author Rohit Agarwal on 07/03/21 11:30 pm
 * @copyright www.javamultiplex.com
 */
public class ZeroSumSubArrays {

    //Time - O(n^2), Space - O(1)
    public static int method1(int[] arr, int n) {
        int count = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
            sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
