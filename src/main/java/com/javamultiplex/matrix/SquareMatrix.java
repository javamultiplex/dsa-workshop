package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 18/02/21 10:31 pm
 * @copyright www.javamultiplex.com
 */
public class SquareMatrix {

    public static boolean isSquareMatrix(int[][] mat) {
        int rows = mat.length;
        for (int i = 0; i < rows; i++) {
            int columns = mat[i].length;
            if (rows != columns) {
                return false;
            }
        }
        return true;
    }

}