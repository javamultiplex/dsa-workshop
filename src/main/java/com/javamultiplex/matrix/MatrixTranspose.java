package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 18/02/21 10:40 pm
 * @copyright www.javamultiplex.com
 */
//The transpose [M]^T of an m x n matrix [M] is the n x m matrix obtained by interchanging the rows and columns of [M].
public class MatrixTranspose {

    public static int[][] transpose(int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;
        int[][] transposeMat = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMat[i][j] = mat[j][i];
            }
        }
        return transposeMat;
    }

}
