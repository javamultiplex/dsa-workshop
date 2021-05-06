package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 05/05/21 12:17 am
 * @copyright www.javamultiplex.com
 */

/* You are given two numbers A and B.
 The task is to count the number of bits needed to be flipped to convert A to B.
 */
public class BitDifference {
    public static int v1(int a, int b) {
        int xor = a ^ b;
        int count = 0;
        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(v1(10,20));
        System.out.println(v1(20,25));
    }
}
