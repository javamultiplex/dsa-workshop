package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.array.problems.MaxElementInArray;
import com.javamultiplex.mathematics.problems.NumberOfDigitsInNumber;

/**
 * @author Rohit Agarwal on 07/02/21 10:51 pm
 * @copyright www.javamultiplex.com
 */
public class RadixSort {
    //Time - O(d*(n+k))
    public static void sort(int[] arr) {
        int n = arr.length;
        int max = MaxElementInArray.find(arr);
        int digits = NumberOfDigitsInNumber.method2(max);
        for (int i = 0; i < digits; i++) {
            countingSort(arr, n, i);
        }
    }

    //Time - O(n+k) where k=bucket size, Space - O(k)
    private static void countingSort(int[] arr, int n, int i) {
        int[] count = new int[10];
        int[] temp = new int[n];
        for (int j = 0; j < n; j++) {
            int rem = (arr[j] / (int) Math.pow(10, i)) % 10;
            count[rem]++;
        }

        for (int j = 1; j < 10; j++) {
            count[j] += count[j - 1];
        }

        for (int j = n - 1; j >= 0; j--) {
            int rem = (arr[j] / (int) Math.pow(10, i)) % 10;
            temp[count[rem] - 1] = arr[j];
            count[rem]--;
        }

        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }

    }
}
