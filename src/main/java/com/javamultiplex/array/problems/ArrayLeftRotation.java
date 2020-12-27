package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.JugglingAlgorithm;

/**
 * @author Rohit Agarwal on 27/12/20 3:07 pm
 * @copyright www.javamultiplex.com
 */
//Anti Clock Wise Rotation
// 1 2 3 4 5 -> 3 4 5 1 2
public class ArrayLeftRotation {

    //Time - O(n), Space - O(d)
    public static void method1(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        int j = 0;
        for (int i = d; i < n; i++) {
            arr[j++] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[j++] = temp[i];
        }
    }

    //Time - O(n*d), Space - O(1)
    public static void method2(int[] arr, int n, int d) {
        int temp;
        for (int i = 0; i < d; i++) {
            temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    //Time - O(n), Space - O(1)
    public static void method3(int[] arr, int n, int d) {
        ArrayReversal.reverse(arr, 0, d);
        ArrayReversal.reverse(arr, d, n);
        ArrayReversal.reverse(arr, 0, n);
    }

    //Time - O(n), Space - O(1)
    public static void method4(int[] arr, int n, int d) {
        JugglingAlgorithm.leftRotate(arr, n, d);
    }
}
