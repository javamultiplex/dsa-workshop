package com.javamultiplex.problemoftheday;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 10/04/21 11:15 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestPositiveInteger {

    public static long smallestPositive(long[] array, int n) {
        Arrays.sort(array);
        long ans = 1;
        for (int i = 0; i < n; i++) {
            if (array[i] > ans) {
                return ans;
            }

            ans = ans + array[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        long smallestPositive = smallestPositive(new long[]{1, 10, 3, 11, 6, 15}, 6);
        System.out.println(smallestPositive);
        long smallestPositive1 = smallestPositive(new long[]{1, 1, 1}, 3);
        System.out.println(smallestPositive1);
    }

}
