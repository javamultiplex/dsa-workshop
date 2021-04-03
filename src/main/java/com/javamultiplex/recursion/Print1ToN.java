package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 03/04/21 5:24 pm
 * @copyright www.javamultiplex.com
 */
public class Print1ToN {
    public static void print(int N) {
        if (N == 0) {
            return;
        }
        print(N - 1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        print(10);
    }
}
