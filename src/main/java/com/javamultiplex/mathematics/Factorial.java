package com.javamultiplex.mathematics;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 14/12/20 8:58 pm
 * @copyright www.javamultiplex.com
 */
public class Factorial {

    //O(n)
    //n!=n*(n-1)*(n-2)*...1
    public static BigInteger fact(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        if (bigInteger.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return bigInteger.multiply(fact(number - 1));
    }
}

