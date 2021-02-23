package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 23/02/21 11:08 pm
 * @copyright www.javamultiplex.com
 */
public class Determinant {

    public static int twoCrossTwo(int[][] mat) {
        int n = mat.length;
        int[][] temp;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            temp = createMatrix(mat, j);
            if (j % 2 == 0) {
                sum += mat[i][j] * temp[0][0];
            } else {
                sum -= mat[i][j] * temp[0][0];
            }
        }
        return sum;
    }

    public static int threeCrossThree(int[][] mat) {
        int n = mat.length;
        int[][] temp;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            temp = createMatrix(mat, j);
            if (j % 2 == 0) {
                sum += mat[i][j] * twoCrossTwo(temp);
            } else {
                sum -= mat[i][j] * twoCrossTwo(temp);
            }
        }
        return sum;
    }

    public static int fourCrossFour(int[][] mat) {
        int n = mat.length;
        int[][] temp;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            temp = createMatrix(mat, j);
            if (j % 2 == 0) {
                sum += mat[i][j] * threeCrossThree(temp);
            } else {
                sum -= mat[i][j] * threeCrossThree(temp);
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

    public static void main(String[] args) {
        int sum = twoCrossTwo(new int[][]{
                {1, 2},
                {3, 4}
        });
        System.out.println(sum);

        int sum1 = threeCrossThree(new int[][]{
                {6, 1, 1},
                {4, -2, 5},
                {2, 8, 7}
        });
        System.out.println(sum1);

        int sum2 = fourCrossFour(new int[][]{
                {5, -7, 2, 2},
                {0, 3, 0, -4},
                {-5, -8, 0, 3},
                {0, 5, 0, -6}
        });
        System.out.println(sum2);
    }
}
