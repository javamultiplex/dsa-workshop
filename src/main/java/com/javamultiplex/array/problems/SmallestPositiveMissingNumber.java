package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.BinarySearchAlgorithm;
import com.javamultiplex.array.algorithms.LinearSearchAlgorithm;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 10/01/21 8:03 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestPositiveMissingNumber {

    //Time - O(n*n), Space - O(1)
    public static int method1(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int index = LinearSearchAlgorithm.iterative(arr, n, i);
            if (index == -1) {
                return i;
            }
        }
        return n + 1;
    }

    //Time - O(nlogN), Space - O(1)
    public static int method2(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 1; i <= n; i++) {
            int index = BinarySearchAlgorithm.iterative(arr, n, i);
            if (index == -1) {
                return i;
            }
        }
        return n + 1;
    }
}
