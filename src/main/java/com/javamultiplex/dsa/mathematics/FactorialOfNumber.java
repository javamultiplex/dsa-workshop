package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 23/04/21 12:06 am
 * @copyright www.javamultiplex.com
 */
public class FactorialOfNumber {

    //TC - theta(n), SC - theta(1)
    public static int iterative(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //TC - theta(n), SC - theta(n)
    public static int recursive(int n) {
        if (n == 0) {
            return 1;
        }

        return n * recursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(iterative(5));
        System.out.println(iterative(4));

        System.out.println(recursive(5));
        System.out.println(recursive(4));
    }

}
