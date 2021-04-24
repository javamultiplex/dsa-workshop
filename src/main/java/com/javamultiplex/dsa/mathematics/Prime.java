package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 24/04/21 11:41 pm
 * @copyright www.javamultiplex.com
 */
public class Prime {

    //TC - O(n), SC - O(1)
    public static boolean method1(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    //TC - O(sqrt(n))
    public static boolean method2(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean method3(int n) {
        if (n == 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(method1(1));
        System.out.println(method1(2));
        System.out.println(method1(4));
        System.out.println(method1(13));


        System.out.println(method2(1));
        System.out.println(method2(2));
        System.out.println(method2(4));
        System.out.println(method2(13));
    }
}
