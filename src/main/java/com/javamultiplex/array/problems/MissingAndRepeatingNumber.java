package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.searching.BinarySearch;
import com.javamultiplex.array.algorithms.sorting.QuickSort;

/**
 * @author Rohit Agarwal on 02/02/21 10:25 pm
 * @copyright www.javamultiplex.com
 */
public class MissingAndRepeatingNumber {

    //Time - O(nlog(n)), Space - O(1)
    public static int[] method1(int[] arr, int n) {
        int[] output = new int[2];
        QuickSort.sort(arr);
        for (int i = 1; i <= n; i++) {
            int index = BinarySearch.iterative(arr, n, i);
            if (index == -1) {
                output[0] = i;
                break;
            }
        }
        for (int i = 1; i <= n; i++) {
            int count = FrequencyOfNumber.method1(arr, i);
            if (count > 1) {
                output[1] = i;
                break;
            }
        }
        return output;
    }


    //Time - O(n), Space - O(n)
    public static int[] method2(int[] arr, int n) {
        int[] crr = new int[n + 1];
        int[] output = new int[2];
        for (int i = 0; i < n; i++) {
            crr[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (crr[i] == 0) {
                output[0] = i;
                break;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (crr[i] > 1) {
                output[1] = i;
                break;
            }
        }
        return output;
    }

    //Time - O(n), Space - O(1)
    public static int[] method3(int[] arr, int n) {
        int[] output = new int[2];
        for (int i = 0; i < n; i++) {
            int temp = arr[Math.abs(arr[i]) - 1];
            if (temp < 0) {
                output[1] = Math.abs(arr[i]);
            } else {
                arr[Math.abs(arr[i]) - 1] = -1 * arr[Math.abs(arr[i]) - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                output[0] = i + 1;
            }
        }
        return output;
    }
}
