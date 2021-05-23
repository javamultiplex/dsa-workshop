package com.javamultiplex.dsa.recursion;

/**
 * @author Rohit Agarwal on 03/04/21 5:26 pm
 * @copyright www.javamultiplex.com
 */
public class PrintNTo1 {
    public static void print(int N) {
        if (N == 0) {
            return;
        }
        System.out.println(N);
        print(N - 1);
    }

    public static void main(String[] args) {
        print(10);
    }
}
