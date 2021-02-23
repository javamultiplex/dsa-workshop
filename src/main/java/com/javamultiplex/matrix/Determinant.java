package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 23/02/21 11:08 pm
 * @copyright www.javamultiplex.com
 */
public class Determinant {

    public static int determinant(int[][] mat) {
        int n = mat.length;
        if (n == 1) {
            return mat[0][0];
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            int[][] temp = createMatrix(mat, j);
            if (j % 2 == 0) {
                sum += mat[0][j] * determinant(temp);
            } else {
                sum -= mat[0][j] * determinant(temp);
            }
        }
        return sum;
    }

    public static int[][] createMatrix(int[][] mat, int column) {
        int n = mat.length;
        int[][] temp = new int[n - 1][n - 1];
        for (int i = 1; i < n; i++) {
            for (int j = 0, k = 0; j < n; j++) {
                if (j != column) {
                    temp[i - 1][k++] = mat[i][j];
                }
            }
        }
        return temp;
    }
}
