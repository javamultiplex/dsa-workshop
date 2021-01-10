package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 10/01/21 10:52 am
 * @copyright www.javamultiplex.com
 */

/**
 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it.
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
 */
public class WaveArray {

    //Time - O(n), Space - O(1)
    public static void convertToWave(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
