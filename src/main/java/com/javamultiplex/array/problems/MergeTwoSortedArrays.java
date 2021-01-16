package com.javamultiplex.array.problems;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 09/01/21 7:03 pm
 * @copyright www.javamultiplex.com
 */
public class MergeTwoSortedArrays {

    //Time - O(m+n), Space - O(m+n)
    public static int[] method1(int[] arr, int[] brr, int m, int n) {
        int[] crr = new int[m + n];
        int j = 0, i = 0, k = 0;
        while (i < m && j < n) {
            if (arr[i] <= brr[j]) {
                crr[k++] = arr[i++];
            } else {
                crr[k++] = brr[j++];
            }
        }

        if (i == m) {
            for (int l = j; l < n; l++) {
                crr[k++] = brr[l];
            }
        } else {
            for (int l = i; l < m; l++) {
                crr[k++] = arr[l];
            }
        }
        return crr;
    }

    //Time - O(n+m)log(n+m) Space - O(1)
    public static void method2(int[] arr, int[] brr, int n, int m) {
        int temp, j = 0, i = n - 1;
        while (i >= 0 && j < m && arr[i] > brr[j]) {
            temp = arr[i];
            arr[i] = brr[j];
            brr[j] = temp;
            i--;
            j++;
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
    }
}
