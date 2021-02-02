package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 02/02/21 10:07 pm
 * @copyright www.javamultiplex.com
 */
public class DamOfCandies {
    public static int method1(int[] height, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int space = j - i - 1;
                int h = Math.min(height[i], height[j]);
                int area = space * h;
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }

    static int maxCandy(int height[], int n)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int space = j - i - 1;
                int h = Math.min(height[i], height[j]);
                int area = space * h;
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }
}
