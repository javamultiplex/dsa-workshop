package com.javamultiplex.dsa.recursion;

/**
 * @author Rohit Agarwal on 25/05/21 10:29 pm
 * @copyright www.javamultiplex.com
 */
public class DigitalRoot {

    /**
     * You are given a number n. You need to find the digital root of n.
     * DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.
     *
     * @param n
     * @return
     */
    public static int digitalRoot(int n) {
        if (n < 10) {
            return n;
        }
        while (n >= 10) {
            n = n % 10 + digitalRoot(n / 10);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(99999));//9
        System.out.println(digitalRoot(12345));//6
        System.out.println(digitalRoot(1));//1
    }
}
