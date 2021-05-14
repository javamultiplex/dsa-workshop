package com.javamultiplex.backtracking;

/**
 * @author Rohit Agarwal on 09/05/21 10:47 pm
 * @copyright www.javamultiplex.com
 */
public class NQueens {

    private static int COUNT = 0;

    public static void countNQueens(boolean[][] grid, int currentRow, int n) {
        if (currentRow == n) {
            COUNT++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isItSafe(grid, currentRow, i, n)) {
                grid[currentRow][i] = true;
                countNQueens(grid, currentRow + 1, n);
                grid[currentRow][i] = false;
            }
        }
    }

    private static boolean isItSafe(boolean[][] grid, int row, int col, int n) {
        //Column Check
        for (int i = row - 1; i >= 0; i--) {
            if (grid[i][col]) {
                return false;
            }
        }
        //Upper Left Diagonal Check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j]) {
                return false;
            }
        }
        //Upper Right Diagonal Check
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (grid[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean[][] grid = new boolean[6][6];
        countNQueens(grid, 0, 6);
        System.out.println(COUNT);
    }
}
