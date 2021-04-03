package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 03/04/21 2:10 pm
 * @copyright www.javamultiplex.com
 */
public class Power {
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        return a * power(a, b - 1);
    }
}
