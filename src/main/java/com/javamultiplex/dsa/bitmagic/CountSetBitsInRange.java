package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 29/05/21 11:52 pm
 * @copyright www.javamultiplex.com
 */
public class CountSetBitsInRange {
    public static int v1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += count(i);
        }
        return count;
    }

    //https://www.youtube.com/watch?v=g6OxU-hRGtY
    public static int v2(int n) {
        if (n == 0) {
            return 0;
        }
        int x = highestPower2(n);
        int setBitsBeforeHighest2PowerX = x * (1 << (x - 1));
        int setBitsInMSBFromHighest2PowerXTon = n - (1 << x) + 1;
        int remainingSetBits = v2(n - (1 << x));
        return setBitsBeforeHighest2PowerX + setBitsInMSBFromHighest2PowerXTon + remainingSetBits;
    }

    private static int highestPower2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }

    private static int count(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(v1(4));
        System.out.println(v1(17));
        System.out.println(v2(4));
        System.out.println(v2(17));
    }
}
