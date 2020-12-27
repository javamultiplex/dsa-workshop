package com.javamultiplex.mathematics.problems;

/**
 * @author Rohit Agarwal on 13/12/20 10:09 pm
 * @copyright www.javamultiplex.com
 */
//LCM -> Least Common Multiple
//LCM * HCF = a * b
public class LCM {
    public static int getLCM(int a, int b) {
        int gcd = GCD.gcd(a, b);
        return (a * b) / gcd;
    }
    public static long getLCM(long a, long b) {
        long gcd = GCD.gcd(a, b);
        return (a * b) / gcd;
    }
}
