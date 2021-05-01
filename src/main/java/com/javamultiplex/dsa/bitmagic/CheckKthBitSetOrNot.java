package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 28/04/21 11:54 pm
 * @copyright www.javamultiplex.com
 */
public class CheckKthBitSetOrNot {
    public static boolean v1(int n, int k) {
        return (n & (1 << (k - 1))) != 0;
    }

    public static boolean v2(int n, int k) {
        return ((n >> (k - 1)) & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println(v1(5, 3));
        System.out.println(v1(5, 2));

        System.out.println(v2(5, 3));
        System.out.println(v2(5, 2));
    }
}
