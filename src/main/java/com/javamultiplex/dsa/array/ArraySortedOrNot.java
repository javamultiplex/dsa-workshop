package com.javamultiplex.dsa.array;

/**
 * @author Rohit Agarwal on 05/06/21 3:30 pm
 * @copyright www.javamultiplex.com
 */
//We need to check array is sorted or not in non-decreasing order
public class ArraySortedOrNot {
    public static boolean v1(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(v1(new int[]{10, 20, 30}));
        System.out.println(v1(new int[]{10}));
        System.out.println(v1(new int[]{10, 20, 20, 30}));
        System.out.println(v1(new int[]{100, 300, 200}));
    }
}
