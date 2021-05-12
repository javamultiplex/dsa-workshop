package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 08/05/21 7:38 pm
 * @copyright www.javamultiplex.com
 */
public class MakeItOne {
    static long makeItOne(long N) {
        int count = 0;
        while (N != 1) {
            if ((int) Math.floor(log(N)) == (int) Math.ceil(log(N))) {
                N = N >> 1;
                count++;
            } else {
                int x = (int) Math.floor(log(N));
                N = N - (int) Math.pow(2, x);
                count++;
            }
        }
        return count;
    }

    private static double log(long N) {
        return Math.log(N) / Math.log(2);
    }

    public static boolean isPowerOf2(long n) {
        return n != 0 && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(makeItOne(8));
        System.out.println(makeItOne(16));
        System.out.println(makeItOne(7));
        //11-8=3-2=1
        System.out.println(makeItOne(11));
    }
}
