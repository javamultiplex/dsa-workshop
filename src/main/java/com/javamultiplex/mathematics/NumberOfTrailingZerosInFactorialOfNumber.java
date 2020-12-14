package com.javamultiplex.mathematics;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 14/12/20 8:38 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfTrailingZerosInFactorialOfNumber {

    private static BigInteger factorial(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        if (bigInteger.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return bigInteger.multiply(factorial(number - 1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(90));
    }

    public static int method1(int number) {
        BigInteger factorial = factorial(number);
        int count = 0;
        while (factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            factorial = factorial.divide(BigInteger.TEN);
        }
        return count;
    }
}
