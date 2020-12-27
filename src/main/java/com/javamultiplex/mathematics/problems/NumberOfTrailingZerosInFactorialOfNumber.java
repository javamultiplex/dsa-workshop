package com.javamultiplex.mathematics.problems;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 14/12/20 8:38 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfTrailingZerosInFactorialOfNumber {

    //O(number of digits in given number!)
    public static int method1(int number) {
        BigInteger factorial = Factorial.fact(number);
        int count = 0;
        while (factorial.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            factorial = factorial.divide(BigInteger.TEN);
        }
        return count;
    }

    //O(number of digits in given number)

    /*
    A trailing zero is always produced by the prime factors 2 and 5.
    If we can count the number of 5s and 2s in prime factorization of N!, our task is done.

    Consider the following examples:
    N = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So count of trailing 0s is 1.
    N = 11: There are two 5s and three 2s in prime factors of 11! (2 8 * 34 * 52 * 7). So count of trailing 0s is 2.

    We can easily observe that the number of 2s in prime factors is always more than or equal to the number of 5s. So if we count 5s in prime factors, we are done.

    Trailing 0s in N! = Count of 5s in prime factors of n!
                  = floor(n/5) + floor(n/25) + floor(n/125) + ....

     */
    public static int method2(int number) {
        int numberOfDigits = NumberOfDigitsInNumber.method2(number);
        int numberOf5s = 0;
        for (int i = 1; i <= numberOfDigits; i++) {
            numberOf5s += Math.floor(number / Math.pow(5, i));
        }
        return numberOf5s;
    }
}
