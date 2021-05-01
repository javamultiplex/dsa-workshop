package com.javamultiplex.dsa.bitmagic;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 29/04/21 12:09 am
 * @copyright www.javamultiplex.com
 */
public class CountSetBits {
    //TC - O(total_number_of_bits_in_integer)
    public static int v1(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }

    //TC - O(total_number_of_bits_in_integer)
    public static int v2(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    //TC - O(total_number_of_bits_in_integer)
    public static int v3(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }

    //TC - O(total_number_of_set_bits_in_integer)
    //Brian Kernighan's algorithm
    public static int v4(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    //TC - O(1)
    //Table lookup algorithm
    public static int v5(int n) {
        int[] table = new int[256];
        table[0] = 0;
        for (int i = 1; i <= 255; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
        int res = table[n & 255];
        n = n >> 8;
        res = res + table[n & 255];
        n = n >> 8;
        res = res + table[n & 255];
        n = n >> 8;
        res = res + table[n & 255];
        return res;
    }

    public static void main(String[] args) {
        System.out.println(v1(5));
        System.out.println(v1(11));


        System.out.println(v2(5));
        System.out.println(v2(11));

        System.out.println(v3(5));
        System.out.println(v3(11));

        System.out.println(v4(5));
        System.out.println(v4(11));

        System.out.println(v5(13));
    }
}
