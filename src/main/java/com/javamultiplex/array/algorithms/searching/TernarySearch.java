package com.javamultiplex.array.algorithms.searching;

/**
 * @author Rohit Agarwal on 24/01/21 10:32 pm
 * @copyright www.javamultiplex.com
 */
public class TernarySearch {

    //Time - O(log(n)), Space - O(log(n))
    public static int recursive(int[] arr, int n, int numberToSearch) {
        return recursive(arr, 0, n - 1, numberToSearch);
    }

    private static int recursive(int[] arr, int left, int right, int numberToSearch) {
        if (left <= right) {
            int mid1 = left + (right - left) / 2;
            int mid2 = right - (right - left) / 2;
            if (arr[mid1] == numberToSearch) {
                return mid1;
            } else if (arr[mid2] == numberToSearch) {
                return mid2;
            } else if (numberToSearch < arr[mid1]) {
                return recursive(arr, left, mid1 - 1, numberToSearch);
            } else if (numberToSearch > arr[mid1] && numberToSearch < arr[mid2]) {
                return recursive(arr, mid1 + 1, mid2 - 1, numberToSearch);
            } else {
                return recursive(arr, mid2 + 1, right, numberToSearch);
            }
        }
        return -1;
    }

    //Time - O(log(n)), Space - O(1)
    public static int iterative(int[] arr, int n, int numberToSearch) {
        return iterative(arr, 0, n - 1, numberToSearch);
    }

    private static int iterative(int[] arr, int left, int right, int numberToSearch) {
        while (left <= right) {
            int mid1 = left + (right - left) / 2;
            int mid2 = right - (right - left) / 2;
            if (arr[mid1] == numberToSearch) {
                return mid1;
            } else if (arr[mid2] == numberToSearch) {
                return mid2;
            } else if (numberToSearch < arr[mid1]) {
                right = mid1 - 1;
            } else if (numberToSearch > arr[mid1] && numberToSearch < arr[mid2]) {
                left = mid1 + 1;
                right = mid2 - 1;
            } else {
                left = mid2 + 1;
            }
        }
        return -1;
    }
}
