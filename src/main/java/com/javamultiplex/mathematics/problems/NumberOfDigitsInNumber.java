package com.javamultiplex.mathematics.problems;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 12/12/20 6:11 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfDigitsInNumber {

    //O(digitCount)
    public static int method1(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    //O(digitCount)
    public static int method1(BigInteger number) {
        int count = 0;
        while (!number.equals(BigInteger.ZERO)) {
            count++;
            number = number.divide(BigInteger.TEN);
        }
        return count;
    }

    //O(1)
    public static int method2(int number) {
        return (int) Math.floor(Math.log10(number)) + 1;
    }

    //O(1)
    public static int method2(BigInteger number) {
        return (int) Math.floor(Math.log10(number.doubleValue())) + 1;
    }
}
