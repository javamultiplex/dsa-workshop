package com.javamultiplex.dsa.recursion;

import java.util.LinkedList;

/**
 * @author Rohit Agarwal on 23/05/21 2:36 pm
 * @copyright www.javamultiplex.com
 */
public class SubsetSumProblem {

    //TC - O(2^n)
    public static int v1(int[] arr, int n, int index, LinkedList<Integer> list, int expectedSum) {
        if (index == n) {
            int sum = list.stream().mapToInt(i -> i).sum();
            return sum == expectedSum ? 1 : 0;
        }
        list.addLast(arr[index]);
        int res1 = v1(arr, n, index + 1, list, expectedSum);
        list.removeLast();
        int res2 = v1(arr, n, index + 1, list, expectedSum);
        return res1 + res2;
    }

    //TC - O(2^n)
    public static int v2(int[] arr, int n, int sum) {
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }
        return v2(arr, n - 1, sum - arr[n - 1])
                + v2(arr, n - 1, sum);
    }

    public static void main(String[] args) {
        System.out.println(v1(new int[]{1, 2, 3}, 3, 0, new LinkedList<>(), 4));
        System.out.println(v1(new int[]{10, 5, 2, 3, 6}, 5, 0, new LinkedList<>(), 8));

        System.out.println(v2(new int[]{1, 2, 3}, 3, 4));
        System.out.println(v2(new int[]{10, 5, 2, 3, 6}, 5, 8));

    }
}
