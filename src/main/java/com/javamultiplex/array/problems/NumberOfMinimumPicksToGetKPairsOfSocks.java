package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 29/01/21 11:27 pm
 * @copyright www.javamultiplex.com
 */

/**
 * A drawer contains socks of n different colours.
 * The number of socks available of ith colour is given by a[i] where a is an array of n elements.
 * Tony wants to take k pairs of socks out of the drawer.
 * However, he cannot see the colour of the sock that he is picking.
 * You have to tell what is the minimum number of socks Tony has to pick in one attempt from the drawer
 * such that he can be absolutely sure, without seeing their colours, that he will have at least k matching pairs.
 */
public class NumberOfMinimumPicksToGetKPairsOfSocks {

    //Time - O(n), Space - O(1)
    public static int method1(int[] arr, int n, int k) {
        int maxPairs = getMaxPairsCount(arr, n);
        if (k > maxPairs) {
            return -1;
        }
        int sum = getMaxPairsWithoutExhaustingAnyColor(arr, n);

        if (k > sum) {
            return 2 * sum + n + (k - sum);
        } else {
            return 2 * (k - 1) + n + 1;
        }
    }

    private static int getMaxPairsWithoutExhaustingAnyColor(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int rem = arr[i] % 2;
            int quotient = arr[i] / 2;
            if (rem != 0) {
                count += quotient;
            } else {
                count += quotient - 1;
            }
        }
        return count;
    }

    private static int getMaxPairsCount(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += arr[i] / 2;
        }
        return count;
    }
}
