package com.javamultiplex.array.problems;

import com.javamultiplex.array.algorithms.BinarySearchAlgorithm;
import com.javamultiplex.array.algorithms.LinearSearchAlgorithm;

import java.util.Arrays;
import java.util.Hashtable;

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

    //Time - O(n), Space - O(n)
    public static int method3(int[] arr, int n) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                hashtable.put(arr[i], i);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!hashtable.containsKey(i)) {
                return i;
            }
        }
        return n + 1;
    }
}
