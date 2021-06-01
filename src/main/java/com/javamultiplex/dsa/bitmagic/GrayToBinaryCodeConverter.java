package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 07/05/21 11:04 pm
 * @copyright www.javamultiplex.com
 */
public class GrayToBinaryCodeConverter {

    public static int v1(int n) {
        int temp = (1 << 31) & n;
        int res = temp;
        for (int bit = 30; bit >= 0; bit--) {
            temp = ((1 << bit) & n) ^ temp;
            res = res + temp;
            temp = temp >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(v1(0));
    }
}
