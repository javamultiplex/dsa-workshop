package com.javamultiplex.array.algorithms.sorting;

/**
 * @author Rohit Agarwal on 23/01/21 11:29 pm
 * @copyright www.javamultiplex.com
 */
public class MergeSort {

    //Time - O(nlog(n)), Space - O(n)
    public static void sort(int[] arr, int n) {
        mergeSort(arr, 0, n - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n = mid - left + 1;
        int m = right - mid;
        int[] lArray = new int[n];
        int[] rArray = new int[m];
        int j = 0, k = 0;
        for (int i = left; i <= mid; i++) {
            lArray[j++] = arr[i];
        }
        for (int i = mid + 1; i <= right; i++) {
            rArray[k++] = arr[i];
        }
        j = 0;
        k = 0;
        int l = left;
        while (j < n && k < m) {
            if (lArray[j] < rArray[k]) {
                arr[l++] = lArray[j++];
            } else {
                arr[l++] = rArray[k++];
            }
        }

        while (j < n) {
            arr[l++] = lArray[j++];
        }

        while (k < m) {
            arr[l++] = rArray[k++];
        }
    }
}
