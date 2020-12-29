package com.javamultiplex.array.algorithms;

import com.javamultiplex.array.problems.ArrayReversal;

/**
 * @author Rohit Agarwal on 29/12/20 11:01 pm
 * @copyright www.javamultiplex.com
 */
public class ReversalAlgorithm {

    //Time - O(n), Space - O(1)
    public static void leftRotate(int[] arr, int n, int d) {
        ArrayReversal.method1(arr, 0, d - 1);
        ArrayReversal.method1(arr, d, n - 1);
        ArrayReversal.method1(arr, 0, n - 1);
    }

    //Time - O(n), Space - O(1)
    public static void rightRotate(int[] arr, int n, int d) {
        ArrayReversal.method1(arr, 0, n - d - 1);
        ArrayReversal.method1(arr, n - d, n - 1);
        ArrayReversal.method1(arr, 0, n - 1);
    }

}
