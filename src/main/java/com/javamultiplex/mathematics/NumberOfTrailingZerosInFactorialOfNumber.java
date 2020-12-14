package com.javamultiplex.mathematics;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 14/12/20 8:38 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfTrailingZerosInFactorialOfNumber {

    public static int method1(int number) {
        BigInteger factorial = Factorial.fact(number);
        int count = 0;
        while (factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            factorial = factorial.divide(BigInteger.TEN);
        }
        return count;
    }
}
