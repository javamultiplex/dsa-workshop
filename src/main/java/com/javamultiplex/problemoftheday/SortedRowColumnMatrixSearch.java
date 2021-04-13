package com.javamultiplex.problemoftheday;

/**
 * @author Rohit Agarwal on 13/04/21 8:20 pm
 * @copyright www.javamultiplex.com
 */
public class SortedRowColumnMatrixSearch {

    public static boolean search(int[][] matrix, int n, int m, int x) {
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                return true;
            } else if (x > matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
