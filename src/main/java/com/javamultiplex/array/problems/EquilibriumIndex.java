package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 04/01/21 11:03 pm
 * @copyright www.javamultiplex.com
 */
/*
Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
We are given an Array of integers, We have to find out the first index i from left such that -
A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]
 */
public class EquilibriumIndex {

    //Time - O(n*n), Space - O(1)
    public static int method1(int[] arr, int n) {
        for (int i = 1; i < n - 1; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}
