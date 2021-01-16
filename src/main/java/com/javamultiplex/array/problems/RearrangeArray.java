package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 16/01/21 2:24 pm
 * @copyright www.javamultiplex.com
 */

/**
 * Given an array arr[] of size N where every element is in the range from 0 to n-1.
 * Rearrange the given array so that arr[i] becomes arr[arr[i]].
 */
public class RearrangeArray {

    //Time - O(n), Space - O(n)
    public static void method1(long[] arr, int n) {
        long[] brr = new long[n];
        for (int i = 0; i < n; i++) {
            brr[i] = arr[(int) arr[i]];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = brr[i];
        }
    }

    //Time - O(n), Space - O(1)

    /**
     * if each element of an array lies between 0 to n-1
     * and we want to store old value(A = arr[i]) and new value(B = arr[arr[i]]) at arr[i] then how can we do this?
     * <p>
     * We will do A = A + B*n
     * <p>
     * Now we will get old value by A= A%n and new value by B = A/n
     */
    public static void method2(long[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] += (arr[(int) arr[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}
