package com.javamultiplex.matrix;

/**
 * @author Rohit Agarwal on 01/03/21 11:43 pm
 * @copyright www.javamultiplex.com
 */
public class SearchElementInRowWiseAndColumnWiseSortedMatrix {

    //Time - O(n), Space - O(1)
    public static boolean search(int[][] mat, int x) {
        int row = mat.length;
        int column = mat[0].length;
        int i = 0, j = column - 1;

        while (i < row && j >= 0) {
            if (mat[i][j] == x) {
                return true;
            } else if (x > mat[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}