package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 02/02/21 10:33 pm
 * @copyright www.javamultiplex.com
 */
public class FrequencyOfNumber {
    //Time - O(log(n)), Space - O(1)
    public static int method1(int[] arr, int number) {
        int leftMostIndex = LeftMostIndex.method1(arr, number);
        int rightMostIndex = RightMostIndex.method1(arr, number);
        if (leftMostIndex == -1 || rightMostIndex == -1) {
            return 0;
        }
        return rightMostIndex - leftMostIndex + 1;
    }
}
