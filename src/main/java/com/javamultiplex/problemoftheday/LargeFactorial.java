package com.javamultiplex.problemoftheday;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 10/04/21 6:56 pm
 * @copyright www.javamultiplex.com
 */
public class LargeFactorial {
    private static final int TEN_POWER_9_PLUS_7 = 1000000007;

    public static long[] factorial(long[] a, int n) {
        int max = max(a, n);
        long[] fact = new long[max + 1];
        fact[0] = 1;
        for (int i = 1; i <= max; i++) {
            fact[i] = (fact[i - 1] * i) % TEN_POWER_9_PLUS_7;
        }
        long[] output = new long[n];
        for (int i = 0; i < n; i++) {
            output[i] = fact[(int)a[i]];
        }
        return output;
    }

    private static int max(long[] a, int n) {
        int max = (int) a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = (int) a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        long[] factorial = factorial(new long[]{0, 1, 2, 3, 4}, 5);
        System.out.println(Arrays.toString(factorial));
    }
}
