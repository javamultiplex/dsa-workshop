package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 06/05/21 11:17 pm
 * @copyright www.javamultiplex.com
 */

//Given a number N.
// The task is to check whether it is sparse or not.
// A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
public class SparseNumber {

    public static boolean v1(int n) {
        while (n != 0) {
            if ((n & 1) == 1 && (n >> 1 & 1) == 1) {
                return false;
            }
            n = n >> 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(v1(5));//true
        System.out.println(v1(3));//false
        System.out.println(v1(12));//false
        System.out.println(v1(10));//true
    }

}
