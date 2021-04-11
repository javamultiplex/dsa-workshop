package com.javamultiplex.problemoftheday;

/**
 * @author Rohit Agarwal on 11/04/21 11:07 am
 * @copyright www.javamultiplex.com
 */
public class SquareRootOfNumber {
    public static long floorSqrt(long number) {
        long left = 1;
        long right = number;
        long ans = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid <= number) {
                ans = mid;
                left = mid + 1;
            } else if (mid * mid > number) {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(floorSqrt(35));
    }
}
