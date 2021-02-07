package com.javamultiplex.array.algorithms.sorting;

/**
 * @author Rohit Agarwal on 16/01/21 4:58 pm
 * @copyright www.javamultiplex.com
 */
public class InsertionSort {

    //Worst Time - O(n*n), Best Time - Omega(n), Space - O(1)
    public static void sort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 1; i < n; i++) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
