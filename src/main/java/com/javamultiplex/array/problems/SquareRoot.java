package com.javamultiplex.array.problems;

/**
 * @author Rohit Agarwal on 26/01/21 10:25 pm
 * @copyright www.javamultiplex.com
 */

/**
 * Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).
 */
public class SquareRoot {

    //Time - O(n), Space - O(1)
    public static long method1(long number) {
        if (number == 0 || number == 1) {
            return number;
        }

        int i = 1, result = 1;
        while (result <= number) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    //Time - O(log(n)), Space - O(1)
    public static long method2(long number) {
        long lo = 1, hi = number;
        long mid, ans = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (mid * mid == number) {
                return mid;
            } else if (mid * mid < number) {
                lo = mid + 1;
                ans = mid;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

}
