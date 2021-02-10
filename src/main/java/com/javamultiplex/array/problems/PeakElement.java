package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 10/02/21 11:09 pm
 * @copyright www.javamultiplex.com
 */
public class PeakElement {

    //Time - O(n), Space - O(1)
    public static int method1(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }

        if (arr[0] > arr[1]) {
            return 0;
        }

        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    //Time - O(log(n)), Space - O(1)
    public static int method2(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else if (mid < n - 1 && arr[mid + 1] > arr[mid]) {
                left = mid + 1;
            }
        }
        return 0;
    }
}
