package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 27/12/20 3:36 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayReversal {
    //Time - O(n), Space - O(1)
    public static void method1(int[] arr, int left, int right) {
        int i = left, j = right;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //Time - O(n), Space - O(stack_size)
    public static void method2(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        method2(arr, left + 1, right - 1);
    }
}
