package com.javamultiplex.problemoftheday;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 12/04/21 11:11 pm
 * @copyright www.javamultiplex.com
 */
public class InversionCount {

    public static long inversionCount(long[] arr, long N) {
        return mergeSort(arr, 0, (int) (N - 1));
    }

    public static long mergeSort(long[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) / 2;
        long count = 0;
        count += mergeSort(arr, left, mid);
        count += mergeSort(arr, mid + 1, right);
        count += merge(arr, left, mid, right);
        return count;
    }

    private static long merge(long[] arr, int left, int mid, int right) {
        long count = 0;
        int n = mid - left + 1;
        int m = right - mid;
        long[] d = new long[m + n];
        int k = left;
        int j = mid + 1;
        int l = 0;
        while (k <= mid && j <= right) {
            if (arr[k] <= arr[j]) {
                d[l++] = arr[k++];
            } else {
                count += mid - k + 1;
                d[l++] = arr[j++];
            }
        }

        while (k <= mid) {
            d[l++] = arr[k++];
        }

        while (j <= right) {
            d[l++] = arr[j++];
        }
        l = 0;
        for (int i = left; i <= right; i++) {
            arr[i] = d[l++];
        }
        return count;
    }

    public static void main(String[] args) {
        long[] arr = {3,1,2};
        System.out.println(inversionCount(arr, 3));
        System.out.println(Arrays.toString(arr));
    }
}
