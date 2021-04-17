package com.javamultiplex.problemoftheday;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 17/04/21 10:10 pm
 * @copyright www.javamultiplex.com
 */
public class IsSudokuValid {
    public static int isValid(int[][] mat) {
        Map<Integer, Integer> map = null;
        for (int i = 0; i < 9; i++) {
            map = new HashMap<>(9);
            for (int j = 0; j < 9; j++) {
                int value = mat[i][j];
                if (value != 0 && map.containsKey(value)) {
                    return 0;
                } else {
                    map.put(value, 1);
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            map = new HashMap<>(9);
            for (int i = 0; i < 9; i++) {
                int value = mat[i][j];
                if (value != 0 && map.containsKey(value)) {
                    return 0;
                } else {
                    map.put(value, 1);
                }
            }
        }

        for (int i = 0; i <= 6; i = i + 3) {
            for (int j = 0; j <= 6; j = j + 3) {
                if (!suduko(mat, i, j)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    private static boolean suduko(int[][] mat, int row, int column) {
        Map<Integer, Integer> map = new HashMap<>(3);
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                int value = mat[i][j];
                if (value != 0 && map.containsKey(value)) {
                    return false;
                } else {
                    map.put(value, 1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        System.out.println(isValid(mat));
    }
}
