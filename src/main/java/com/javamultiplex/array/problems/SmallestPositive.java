package com.javamultiplex.array.problems;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 28/01/21 10:35 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestPositive {

    //Time - O(nlog(n)), Space - O(1)
    public static long method1(long[] array, int n) {
        Arrays.sort(array);
        long res = 1;
        for (int i = 0; i < n && array[i] <= res; i++) {
            res = res + array[i];
        }
        return res;
    }

}
