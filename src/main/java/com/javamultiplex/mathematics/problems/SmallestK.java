package com.javamultiplex.mathematics.problems;

import java.util.Stack;

/**
 * Given a non-negative number n. The problem is to find the smallest number k such that the product of digits of k is equal to n.
 * If no such number k can be formed then print “-1”.
 */
public class SmallestK {
    public static long smallestK(long n) {
        if (n >= 0 && n <= 9) {
            return n;
        }

        Stack<Integer> digits = new Stack<>();

        for (int i = 9; i >= 2 && n > 1; i--) {
            while (n % i == 0) {
                digits.push(i);
                n = n / i;
            }
        }

        if (n != 1) {
            return -1;
        }
        long k = 0;
        while (!digits.empty()) {
            k = k * 10 + digits.peek();
            digits.pop();
        }
        return k;
    }
}