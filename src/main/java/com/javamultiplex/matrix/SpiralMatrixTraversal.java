package com.javamultiplex.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 30/01/21 3:50 pm
 * @copyright www.javamultiplex.com
 */

/**
 * Input:  1    2   3   4
 * 5    6   7   8
 * 9   10  11  12
 * 13  14  15  16
 * Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 * Explanation: The output is matrix in spiral format.
 */
public class SpiralMatrixTraversal {


    //Time - O(m*n), Space = O(m*n)

    /**
     * Input:  1    2   3   4
     * 5    6   7   8
     * 9   10  11  12
     * 13  14  15  16
     * Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
     * Explanation: The output is matrix in spiral format.
     */
    public static List<Integer> traverse(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = mat[0].length - 1, top = 0, bottom = mat.length - 1;
        int size = mat.length * mat[0].length;
        while (list.size() < size) {
            for (int i = left; i <= right && list.size() < size; i++) {
                list.add(mat[top][i]);
            }
            top++;
            for (int i = top; i <= bottom && list.size() < size; i++) {
                list.add(mat[i][right]);
            }
            right--;
            for (int i = right; i >= left && list.size() < size; i--) {
                list.add(mat[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top && list.size() < size; i--) {
                list.add(mat[i][left]);
            }
            left++;
        }
        return list;
    }

    //Time - O(m*n), Space = O(1)

    /**
     * Given a matrix of size N x M.
     * You have to find the Kth element which will obtain
     * while traversing the matrix spirally starting from the top-left corner of the matrix.
     */
    public static int findK(int[][] mat, int n, int m, int k) {
        int left = 0, right = m - 1, top = 0, bottom = n - 1;
        int count = 0;
        while (true) {
            int temp = -1;
            for (int i = left; i <= right && count != k; i++) {
                temp = mat[top][i];
                count++;
            }
            if (count == k) {
                return temp;
            }
            top++;
            for (int i = top; i <= bottom && count != k; i++) {
                temp = mat[i][right];
                count++;
            }
            if (count == k) {
                return temp;
            }
            right--;
            for (int i = right; i >= left && count != k; i--) {
                temp = mat[bottom][i];
                count++;

            }
            if (count == k) {
                return temp;
            }
            bottom--;
            for (int i = bottom; i >= top && count != k; i--) {
                temp = mat[i][left];
                count++;

            }
            if (count == k) {
                return temp;
            }
            left++;
        }
    }
}
