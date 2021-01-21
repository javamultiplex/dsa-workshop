package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 21/01/21 11:26 pm
 * @copyright www.javamultiplex.com
 */
public class ArraySwap {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
