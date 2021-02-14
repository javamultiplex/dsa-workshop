package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 13/02/21 10:59 pm
 * @copyright www.javamultiplex.com
 */
public class SearchElementInSortedAndRotatedArray {

    public static int search(int[] arr, int key) {
        int length = arr.length;
        int pivot = 0;
        if (length > 1) {
            pivot = findPivotElement(arr);
        }

        if (key < arr[0]) {
            return binarySearch(arr, pivot + 1, length - 1, key);
        } else {
            return binarySearch(arr, 0, pivot, key);
        }
    }

    //arr[pivot+1]<arr[pivot]
    private static int findPivotElement(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == n - 1 || arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[left] > arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    private static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
