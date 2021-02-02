package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 02/02/21 11:11 pm
 * @copyright www.javamultiplex.com
 */
public class RightMostIndex {

    //Time - O(log(n)), Space = O(1)
    public static int method1(int[] arr, int key) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if ((arr[mid] == key && mid == arr.length - 1) || (arr[mid] == key && arr[mid + 1] > key)) {
                return mid;
            } else if (key < arr[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
}
