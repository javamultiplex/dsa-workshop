package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 02/05/21 12:26 am
 * @copyright www.javamultiplex.com
 */
//in array, elements are in range 1 to n+1, find missing number
public class MissingNumber {

    //TC - O(n), SC - O(1)
    public static int v1(int[] arr) {
        int n = arr.length;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum = actualSum + arr[i];
        }
        int expectedSum = ((n + 1) * (n + 2)) / 2;
        return expectedSum - actualSum;
    }

    //TC - O(n), SC - O(1)
    public static int v2(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 1; i <= (n + 1); i++) {
            res = res ^ i;
        }

        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(v1(new int[]{1, 5, 3, 2}));
        System.out.println(v1(new int[]{1, 4, 3}));

        System.out.println(v2(new int[]{1, 5, 3, 2}));
        System.out.println(v2(new int[]{1, 4, 3}));
    }

}