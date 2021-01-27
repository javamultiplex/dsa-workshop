package com.javamultiplex.mathematics.problems;

/**
 * @author Rohit Agarwal on 27/01/21 10:23 pm
 * @copyright www.javamultiplex.com
 */

import java.util.Stack;

/**
 * Given a positive integer N.
 * You have to find Nth natural number after removing all the numbers containing digit 9 .
 */
public class FindNthNaturalNumber {

    //Time - O(n), Space - O(1)
    public static long method1(long N) {
        long count = 0;
        long i = 1;
        while (count != N) {
            if ((i + 1) % 10 != 0) {
                count++;
            }
            i++;
        }
        return i - 1;
    }

    public static long method2(long N) {
        return Long.parseLong(Long.toString(N, 9));
    }


    public static long method3(long N) {
        long remainder;
        Stack<Long> stack = new Stack<>();
        while (N != 0) {
            remainder = N % 9;
            stack.push(remainder);
            N = N / 9;
        }
        long sum = 0;
        while (!stack.empty()) {
            sum = 10 * sum + stack.peek();
            stack.pop();
        }
        return sum;
    }

    public static long method4(long N) {
        long remainder;
        StringBuilder builder = new StringBuilder();
        while (N != 0) {
            remainder = N % 9;
            builder.append(remainder);
            N = N / 9;
        }
        return Long.parseLong(builder.reverse().toString());
    }

}
