package com.javamultiplex.matrix;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 18/02/21 11:37 pm
 * @copyright www.javamultiplex.com
 */
public class MatrixComparison {

    public static boolean compare(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            if (!Arrays.equals(mat1[i], mat2[i])) {
                return false;
            }
        }
        return true;
    }
}
