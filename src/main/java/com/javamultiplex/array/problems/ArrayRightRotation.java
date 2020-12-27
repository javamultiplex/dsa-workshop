package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 27/12/20 3:07 pm
 * @copyright www.javamultiplex.com
 */
//Clock Wise Rotation
// 1 2 3 4 5 -> 4 5 1 2 3
public class ArrayRightRotation {

    //Time - O(n), Space - O(d)
    public static void method1(int[] arr, int n, int d) {
        int[] temp = new int[d];
        for (int i = n - d, j = 0; i < n; i++) {
            temp[j++] = arr[i];
        }

        int j = n - 1;
        for (int i = n - d - 1; i >= 0; i--) {
            arr[j--] = arr[i];
        }

        for (int i = d - 1; i >= 0; i--) {
            arr[j--] = temp[i];
        }
    }

}
