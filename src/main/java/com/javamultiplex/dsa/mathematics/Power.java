package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 25/04/21 5:01 pm
 * @copyright www.javamultiplex.com
 */
public class Power {

    //TC - O(b), SC - O(1)
    public static int v1(int a, int b) {
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow *= a;
        }
        return pow;
    }

    //TC - O(n), SC - O(n)
    public static int v2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * v2(a, --b);
    }

    //TC - O(log(n)), SC - O(log(n))
    public static int v3(int a, int b) {
        /**
         *
         * f(a,n) = (a,n/2)*(a,n/2) if n is even
         *        = (a,n-1)*a if n is odd
         */

        if (b == 0) {
            return 1;
        }

        if (b == 1) {
            return a;
        }

        int temp = v3(a, b / 2);
        if (b % 2 == 0) {
            return temp * temp;
        } else {
            return a * temp * temp;
        }
    }

    //TC - O(log(n)), SC - O(1)
    public static int v4(int a, int b) {
        int res = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                res = res * a;
            }
            b = b / 2;
            a = a * a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(v1(2, 3));
        System.out.println(v1(3, 4));

        System.out.println(v2(2, 3));
        System.out.println(v2(3, 4));


        System.out.println(v3(2, 5));
        System.out.println(v3(2, 4));

        System.out.println(v4(2, 5));
        System.out.println(v4(2, 4));
    }
}
