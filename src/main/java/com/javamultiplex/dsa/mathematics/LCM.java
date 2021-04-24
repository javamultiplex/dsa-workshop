package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 24/04/21 11:08 pm
 * @copyright www.javamultiplex.com
 */
public class LCM {

    //TC - O(a*b-max(a,b)), SC - theta(1)
    public static int method1(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    public static int method2(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(method1(4, 6));
        System.out.println(method1(2, 8));
        System.out.println(method1(2, 7));

        System.out.println(method2(4, 6));
        System.out.println(method2(2, 8));
        System.out.println(method2(2, 7));
    }
}
