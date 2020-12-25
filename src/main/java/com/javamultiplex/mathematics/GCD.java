package com.javamultiplex.mathematics;

/**
 * @author Rohit Agarwal on 13/12/20 9:59 pm
 * @copyright www.javamultiplex.com
 */
//Greatest Common Divisor
//aka HCF -> Highest Common Factors
public class GCD {

    public static int gcd(int a, int b) {
        return (int) EuclideanAlgorithm.gcd(a, b);
    }


    public static long gcd(long a, long b) {
        return EuclideanAlgorithm.gcd(a, b);
    }


    public static int gcd(int a, int b, int[] coefficients) {
        return ExtendedEuclideanAlgorithm.gcd(a, b, coefficients);
    }
}
