package com.javamultiplex.matrix;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 20/02/21 9:08 pm
 * @copyright www.javamultiplex.com
 */
public class Matrix {


    /**
     * The transpose [M]^T of an m x n matrix [M] is the n x m matrix obtained by interchanging the rows and columns of [M].
     *
     * @param mat
     * @return
     */
    public static int[][] transpose(int[][] mat) {
        int rows = rows(mat);
        int columns = columns(mat);
        int[][] transposeMat = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMat[i][j] = mat[j][i];
            }
        }
        return transposeMat;
    }

    /**
     * A square Matrix has as many rows as it has columns. i.e. no of rows = no of columns.
     *
     * @param mat
     * @return
     */
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

    /**
     * A square matrix is said to be symmetric if the transpose of original matrix is equal to its original matrix.
     *
     * @param mat
     * @return
     */
    public static boolean isSymmetricMatrix(int[][] mat) {
        if (isSquareMatrix(mat)) {
            int[][] transpose = transpose(mat);
            return compare(transpose, mat);
        }
        return false;
    }

    /**
     * A skew-symmetric (or antisymmetric or antimetric[1]) matrix is a square matrix whose transpose equals its negative.i.e. (A^T) = -A.
     *
     * @param mat
     * @return
     */
    public static boolean isSkewSymmetricMatrix(int[][] mat) {
        if (isSquareMatrix(mat)) {
            int[][] transpose = transpose(mat);
            negate(mat);
            return compare(transpose, mat);
        }
        return false;
    }

    /**
     * A diagonal matrix is a matrix in which the entries outside the main diagonal are all zero. The term usually refers to square matrices.
     *
     * @param mat
     * @return
     */
    public static boolean isDiagonalMatrix(int[][] mat) {
        int length = rows(mat);
        if (!isSquareMatrix(mat)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j && mat[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * A square matrix in which all the elements of the principal diagonal are ones and all other elements are zeros.Identity matrix is denoted as I.
     *
     * @param mat
     * @return
     */
    public static boolean isIdentityMatrix(int[][] mat) {
        if (!isSquareMatrix(mat)) {
            return false;
        }
        int n = rows(mat);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && mat[i][j] != 0) {
                    return false;
                } else if (mat[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] addition(int[][] mat1, int[][] mat2) {
        return null;
    }

    private static void negate(int[][] mat) {
        int size = rows(mat);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = -1 * mat[i][j];
            }
        }
    }

    private static boolean compare(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < rows(mat1); i++) {
            if (!Arrays.equals(mat1[i], mat2[i])) {
                return false;
            }
        }
        return true;
    }

    private static int rows(int[][] mat) {
        return mat.length;
    }

    private static int columns(int[][] mat) {
        return mat[0].length;
    }

}
