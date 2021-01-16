package com.javamultiplex.array.algorithms.searching;

/**
 * @author Rohit Agarwal on 09/01/21 10:24 pm
 * @copyright www.javamultiplex.com
 */
public class BinarySearchAlgorithm {

    //Time - O(logN), Space - O(n)
    public static int recursive(int[] arr, int n, int numberToSearch) {
        return recursive(arr, 0, n - 1, numberToSearch);
    }

    public static int recursive(int[] arr, int left, int right, int numberToSearch) {
        if (left > right) {
            return -1;
        } else {
            int mid = (left + right) / 2;
            if (arr[mid] == numberToSearch) {
                return mid;
            } else if (numberToSearch > arr[mid]) {
                return recursive(arr, mid + 1, right, numberToSearch);
            } else
                return recursive(arr, left, mid - 1, numberToSearch);
        }
    }

    //Time - O(logN), Space - O(1)
    public static int iterative(int[] arr, int n, int numberToSearch) {
        return iterative(arr, 0, n - 1, numberToSearch);
    }

    public static int iterative(int[] arr, int left, int right, int numberToSearch) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == numberToSearch) {
                return mid;
            } else if (numberToSearch > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
