package com.javamultiplex.dsa.recursion;

/**
 * @author Rohit Agarwal on 29/05/21 12:30 am
 * @copyright www.javamultiplex.com
 */
public class LuckyNumber {
    public static boolean isLucky(int n) {
        return isLucky(n, 2);
    }

    public static boolean isLucky(int n, int i) {
        if (n < i) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isLucky(n - n / i, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isLucky(5));
        System.out.println(isLucky(19));
    }

}
