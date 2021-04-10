package com.javamultiplex.problemoftheday;

/**
 * @author Rohit Agarwal on 10/04/21 3:28 pm
 * @copyright www.javamultiplex.com
 */
public class MissingNumberInArray {
    public static int missingNumber(int[] array, int n) {
        long expectedSize = (long) n * (n + 1) / 2;
        long actualSize = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            actualSize += array[i];
        }
        return (int) (expectedSize - actualSize);
    }


    public static void main(String[] args) {
        int missingNumber = missingNumber(new int[]{1, 2, 3, 5}, 5);
        System.out.println(missingNumber);
        int missingNumber1 = missingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10}, 10);
        System.out.println(missingNumber1);
    }
}
