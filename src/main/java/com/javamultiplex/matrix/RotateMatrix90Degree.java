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
    public static int[][] antiClockWiseMethod2(int[][] mat) {
        int n = mat.length;
        int[][] transpose = Matrix.transpose(mat);
        int top, bottom, temp;
        for (int j = 0; j < n; j++) {
            top = 0;
            bottom = n - 1;
            while (top < bottom) {
                temp = transpose[top][j];
                transpose[top][j] = transpose[bottom][j];
                transpose[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
        return transpose;
    }

    //Time - O(n*n), Space - O(1)
    public static void antiClockWiseMethod3(int[][] mat) {
        int n = mat.length;
        int left = 0;
        int top = 0;
        int bottom = n - 1;
        int right = n - 1;


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

    //Time - O(n*n), Space - O(n*n)
    public static int[][] clockWiseMethod2(int[][] mat) {
        int n = mat.length;
        int[][] transpose = Matrix.transpose(mat);
        int left, right, temp;
        for (int i = 0; i < n; i++) {
            left = 0;
            right = n - 1;
            while (left < right) {
                temp = transpose[i][left];
                transpose[i][left] = transpose[i][right];
                transpose[i][right] = temp;
                left++;
                right--;
            }
        }
        return transpose;
    }

}
