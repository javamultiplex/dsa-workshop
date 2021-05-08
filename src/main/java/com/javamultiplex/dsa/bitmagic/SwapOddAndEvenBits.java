package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 07/05/21 11:19 pm
 * @copyright www.javamultiplex.com
 */
public class SwapOddAndEvenBits {
    public static int v1(int n) {
        int sum = 0;
        int b1 = 0, b2 = 0, i = 0;
        while (n != 0) {
            b1 = n & 1;
            n = n >> 1;
            b2 = n & 1;
            sum += b2 * Math.pow(2, i) + b1 * Math.pow(2, ++i);
            i++;
            n = n >> 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(v1(23));
        System.out.println(v1(2));
    }
}
