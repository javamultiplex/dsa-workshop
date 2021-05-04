package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 05/05/21 12:00 am
 * @copyright www.javamultiplex.com
 */
public class RightMostDifferentBit {
    public static int v1(int m, int n) {
        int xor = m ^ n;
        int position = 0;
        while (xor != 0) {
            position++;
            if ((xor & 1) == 1) {
                break;
            }
            xor = xor >> 1;
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println(v1(11,9));
        System.out.println(v1(52,4));
    }
}
