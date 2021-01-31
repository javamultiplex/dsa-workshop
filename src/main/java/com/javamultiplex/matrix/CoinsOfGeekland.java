package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 31/01/21 10:46 pm
 * @copyright www.javamultiplex.com
 */

/**
 * In Geekland there is a grid of coins of size N x N.
 * You have to find the maximum sum of coins in any sub-grid of size K x K.
 * Note: Coins of the negative denomination are also possible at Geekland.
 * <p>
 * Input: N = 5, K = 3
 * mat[[]] = {1, 1, 1, 1, 1}
 * {2, 2, 2, 2, 2}
 * {3, 8, 6, 7, 3}
 * {4, 4, 4, 4, 4}
 * {5, 5, 5, 5, 5}
 * Output: 48
 * Explanation: {8, 6, 7}
 * {4, 4, 4}
 * {5, 5, 5}
 * has the maximum sum
 */
public class CoinsOfGeekland {

    public static int maximumSum(int[][] mat, int N, int K) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= N - K; i++) {
            for (int j = 0; j <= N - K; j++) {
                int sum = sum(mat, i, j, K);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    private static int sum(int[][] mat, int row, int column, int k) {
        int sum = 0;
        for (int i = row; i < row + k; i++) {
            for (int j = column; j < column + k; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }

}
