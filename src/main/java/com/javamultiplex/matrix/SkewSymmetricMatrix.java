package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 18/02/21 11:33 pm
 * @copyright www.javamultiplex.com
 */
//A skew-symmetric (or antisymmetric or antimetric[1]) matrix is a square matrix whose transpose equals its negative.i.e. (A^T) = -A.
public class SkewSymmetricMatrix {

    public static boolean isSkewSymmetricMatrix(int[][] mat) {
        if (SquareMatrix.isSquareMatrix(mat)) {
            int[][] transpose = MatrixTranspose.transpose(mat);
            negate(mat);
            return MatrixComparison.compare(transpose, mat);
        }
        return false;
    }

    public static void negate(int[][] mat) {
        int size = mat.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = -1 * mat[i][j];
            }
        }
    }

}
