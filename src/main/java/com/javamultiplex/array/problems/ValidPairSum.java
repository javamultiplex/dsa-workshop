package com.javamultiplex.array.problems;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 01/02/21 8:34 pm
 * @copyright www.javamultiplex.com
 */
public class ValidPairSum {

    //Time - O(n*n), Space - O(1)
    public static long method1(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static long method2(int arr[], int n) {
        // Sorting the given array
        Arrays.sort(arr);

        // Variable to store the count of pairs
        int ans = 0;

        // Loop to iterate through the array
        for (int i = 0; i < n; ++i) {

            // Ignore if the value is negative
            if (arr[i] <= 0)
                continue;

            /*
            minReqVal val is the min value ,which will
            give >=1 after adding with the arr[i]
            */
            int minReqVal = -arr[i] + 1;
            int j = lower_bound(arr, minReqVal);

            if (j >= 0)
                ans += i - j;
        }
        return ans;
    }


    private static int lower_bound(int arr[], int val) {
        int start = 0, end = arr.length;

        /*
          using the Binary search technique , since our
          array is sorted
        */
        while (start < end) {
            int mid = (start + end) >> 1;

            if (val > arr[mid])
                start = mid + 1;
            else
                end = mid;
        }

        // when we dont find the answer return -1
        if (start == arr.length)
            return -1;

        return start;
    }

}
