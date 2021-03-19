package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 19/03/21 10:10 pm
 * @copyright www.javamultiplex.com
 */
public class Combination {

    public static int nCr(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else if (r == 1) {
            return n;
        } else {
            return nCr(n - 1, r - 1) + nCr(n - 1, r);
        }
    }
}
