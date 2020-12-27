package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 27/12/20 10:37 pm
 * @copyright www.javamultiplex.com
 */
public class Majority {

    //Time - O(n), Space - O(1)
    public static int method1(int[] arr, int n, int x, int y) {
        int cX = 0, cY = 0, j = x, k = y;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                cX++;
                j = arr[i];
            }

            if (arr[i] == y) {
                cY++;
                k = arr[i];
            }
        }

        if (cX == cY) {
            return Math.min(j, k);
        } else if (cX > cY) {
            return j;
        } else {
            return k;
        }

    }
}
