package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 23/04/21 12:06 am
 * @copyright www.javamultiplex.com
 */
public class FactorialOfNumber {

    //TC - theta(n), SC - theta(1)
    public static int v1(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //TC - theta(n), SC - theta(n)
    public static int v2(int n) {
        if (n == 0) {
            return 1;
        }

        return n * v2(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(v1(5));
        System.out.println(v1(4));

        System.out.println(v2(5));
        System.out.println(v2(4));
    }

}
