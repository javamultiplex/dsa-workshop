package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 06/05/21 11:28 pm
 * @copyright www.javamultiplex.com
 */
public class LongestConsecutive1s {

    public static int v1(int n) {
        int count = 0;
        int max = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            n = n >> 1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(v1(14));
        System.out.println(v1(222));
        System.out.println(v1(8));
        System.out.println(v1(15));
        System.out.println(v1(12));
    }
}
