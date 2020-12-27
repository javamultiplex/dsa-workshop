package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 27/12/20 3:36 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayReversal {
    //Time - O(N), Space - O(1)
    public static void reverse(int[] arr, int left, int right) {
        int i = left, j = right - 1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
