package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.array.problems.ArraySwap;

/**
 * @author Rohit Agarwal on 24/01/21 10:00 pm
 * @copyright www.javamultiplex.com
 */
public class QuickSort {

    //Best Time - O(nlog(n)), Worst Time - O(n*n), Space - O(1)
    public static void sort(int[] arr, int n) {
        quickSort(arr, 0, n - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partition = partition(arr, left, right);
            quickSort(arr, left, partition - 1);
            quickSort(arr, partition + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                ArraySwap.swap(arr, i, j);
            }
        }
        ArraySwap.swap(arr, i + 1, right);
        return i + 1;
    }
}
