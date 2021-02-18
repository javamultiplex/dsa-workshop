package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 18/02/21 11:14 pm
 * @copyright www.javamultiplex.com
 */
//A square matrix is said to be symmetric if the transpose of original matrix is equal to its original matrix.
public class SymmetricMatrix {

    public static boolean isSymmetricMatrix(int[][] mat) {
        if (SquareMatrix.isSquareMatrix(mat)) {
            int[][] transpose = MatrixTranspose.transpose(mat);
            return MatrixComparison.compare(transpose, mat);
        }
        return false;
    }

}
