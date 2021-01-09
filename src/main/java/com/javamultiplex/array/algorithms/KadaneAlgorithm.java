package com.javamultiplex.array.algorithms;

/**
 * @author Rohit Agarwal on 09/01/21 10:43 am
 * @copyright www.javamultiplex.com
 */
public class KadaneAlgorithm {

    //Time - O(n), Space - O(1)
    public static int getLargestSumSubArray(int[] arr, int n) {
        int maxEndingHere = 0, maxSoFar = 0;
        for (int i = 0; i < n; i++) {
            maxEndingHere += arr[i];
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
