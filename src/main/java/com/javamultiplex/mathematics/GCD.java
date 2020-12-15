package com.javamultiplex.mathematics;

/**
 * @author Rohit Agarwal on 13/12/20 9:59 pm
 * @copyright www.javamultiplex.com
 */
//Greatest Common Divisor
//aka HCF -> Highest Common Factors
public class GCD {

    //Euclidean Algorithm
    public static int getGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return getGCD(b % a, a);
    }

    public static long getGCD(long a, long b) {
        if (a == 0) {
            return b;
        }
        return getGCD(b % a, a);
    }
}
