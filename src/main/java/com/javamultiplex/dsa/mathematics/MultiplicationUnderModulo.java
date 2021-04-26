package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 26/04/21 11:35 pm
 * @copyright www.javamultiplex.com
 */
public class MultiplicationUnderModulo {

    public static long v1(long a, long b) {
        int M = 1000000007;
        return ((a % M) * (b % M)) % M;
    }


    public static void main(String[] args) {
        System.out.println(v1(92233720368547758L, 92233720368547758L));
    }
}
