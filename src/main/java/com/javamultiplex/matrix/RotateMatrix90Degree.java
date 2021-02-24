package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 24/02/21 11:44 pm
 * @copyright www.javamultiplex.com
 */
public class RotateMatrix90Degree {

    //Time - O(n*n), Space - O(n*n)
    public static int[][] antiClockWiseMethod1(int[][] mat) {
        int n = mat.length;
        int[][] output = new int[n][n];
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                output[n - 1 - j][i] = mat[i][j];
            }
        }
        return output;
    }

    //Time - O(n*n), Space - O(n*n)
    public static int[][] clockWiseMethod1(int[][] mat) {
        int n = mat.length;
        int[][] output = new int[n][n];
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                output[i][j] = mat[n - 1 - j][i];
            }
        }
        return output;
    }

}
