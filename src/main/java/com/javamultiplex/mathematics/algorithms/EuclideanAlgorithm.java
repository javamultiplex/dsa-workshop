package com.javamultiplex.mathematics.algorithms;

/**
 * @author Rohit Agarwal on 25/12/20 7:24 pm
 * @copyright www.javamultiplex.com
 */
public class EuclideanAlgorithm {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
