package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 30/01/21 4:18 pm
 * @copyright www.javamultiplex.com
 */

/**
 * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
 */
public class SpiralMatrixGeneration {

    public static int[][] generate(int n) {
        int[][] mat = new int[n][n];
        int count = 0;
        int size = n * n;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (count < size) {
            for (int i = left; i <= right && count < size; i++) {
                mat[top][i] = count + 1;
                count++;
            }
            top++;
            for (int i = top; i <= bottom && count < size; i++) {
                mat[i][right] = count + 1;
                count++;
            }
            right--;
            for (int i = right; i >= left && count < size; i--) {
                mat[bottom][i] = count + 1;
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top && count < size; i--) {
                mat[i][left] = count + 1;
                count++;
            }
            left++;
        }
        return mat;
    }
}
