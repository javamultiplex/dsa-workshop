package com.javamultiplex.mathematics;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 17/12/20 9:47 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfDigitsInFactorialOfNumber {

    public static int digitsInFactorial(int n) {
        BigInteger factorial = Factorial.fact(n);
        return NumberOfDigitsInNumber.method2(factorial);
    }
}
