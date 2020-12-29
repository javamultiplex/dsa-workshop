package com.javamultiplex.array.algorithms;

import com.javamultiplex.array.problems.ArrayReversal;

/**
 * @author Rohit Agarwal on 29/12/20 11:01 pm
 * @copyright www.javamultiplex.com
 */
public class ReversalAlgorithm {

    public static void leftRotate(int[] arr, int n, int d) {
        ArrayReversal.reverse(arr, 0, d);
        ArrayReversal.reverse(arr, d, n);
        ArrayReversal.reverse(arr, 0, n);
    }

    public static void rightRotate(int[] arr, int n, int d) {
        ArrayReversal.reverse(arr, 0, n - d);
        ArrayReversal.reverse(arr, n - d, n);
        ArrayReversal.reverse(arr, 0, n);
    }

}
