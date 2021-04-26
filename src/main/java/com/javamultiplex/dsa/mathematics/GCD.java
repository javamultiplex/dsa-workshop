package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 24/04/21 8:15 pm
 * @copyright www.javamultiplex.com
 */
public class GCD {

    //TC - O(min(a,b)), SC - theta(1)
    public static int v1(int a, int b) {
        int res = Math.min(a, b);
        while (res != 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    /**
     * if b<a
     * then GCD(a,b) = GCD(a-b,b)
     * else
     * GCD(a,b) = GCD(a,b-a)
     */
    public static int v2(int a, int b) {
        while (a != b) {
            if (b < a) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    //Euclidean algorithm
    public static int v3(int a, int b) {
        if (b == 0) {
            return a;
        }
        return v3(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(v1(12, 144));
        System.out.println(v1(100, 200));
        System.out.println(v1(5, 7));

        System.out.println(v2(12, 144));
        System.out.println(v2(100, 200));
        System.out.println(v2(5, 7));


        System.out.println(v3(12, 144));
        System.out.println(v3(100, 200));
        System.out.println(v3(5, 7));
    }
}
