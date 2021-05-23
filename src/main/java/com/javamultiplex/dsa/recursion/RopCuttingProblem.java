package com.javamultiplex.dsa.recursion;

/**
 * @author Rohit Agarwal on 21/05/21 11:21 am
 * @copyright www.javamultiplex.com
 */
public class RopCuttingProblem {

    //TS - O(3^n)
    public static int ropCutting(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return -1;
        }

        int res = Math.max(Math.max(
                ropCutting(n - a, a, b, c),
                ropCutting(n - b, a, b, c)
                ),
                ropCutting(n - c, a, b, c)
        );
        if (res == -1) {
            return -1;
        } else {
            return 1 + res;
        }
    }

    public static void main(String[] args) {
        System.out.println(ropCutting(23, 12, 14, 11));//2
        System.out.println(ropCutting(9, 2, 2, 2));//-1
        System.out.println(ropCutting(5, 2, 5, 1));//5
        System.out.println(ropCutting(5, 4, 2, 6));//-1

    }

}
