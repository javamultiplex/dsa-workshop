package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 22/04/21 11:35 pm
 * @copyright www.javamultiplex.com
 */
public class TrailingZerosInFactorialOfNumber {

    public static int v1(int n) {
        int temp = 5;
        int count = 0;
        while (temp <= n) {
            count += Math.floorDiv(n, temp);
            temp = temp * 5;
        }
        return count;
    }


    public static void main(String[] args) {
        int trailingZeros = v1(25);
        System.out.println(trailingZeros);
    }

}
