package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 03/04/21 5:29 pm
 * @copyright www.javamultiplex.com
 */
public class PrintNTo1AndThen1ToN {

    public static void print(int N) {
        if (N == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(N);
        print(N - 1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        print(5);
    }
}
