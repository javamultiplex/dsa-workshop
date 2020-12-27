package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 27/12/20 9:15 pm
 * @copyright www.javamultiplex.com
 */
public class RemoveDuplicate {
    //Time - O(N), Space - O(N)
    public static int method1(int[] arr, int n) {
        int temp = arr[0];
        int[] tempArr = new int[n];
        for (int i = 1; i < n; i++) {
            if (arr[i] == temp) {
                arr[i] = 0;
            } else {
                temp = arr[i];
            }
        }

        int j = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                tempArr[j++] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = tempArr[i];
        }

        return count;
    }
}
