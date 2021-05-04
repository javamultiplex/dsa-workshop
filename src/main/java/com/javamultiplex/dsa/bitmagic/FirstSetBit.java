package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 04/05/21 11:51 pm
 * @copyright www.javamultiplex.com
 */
public class FirstSetBit {
    public static int v1(int n) {
        int position = 0;
        while (n != 0) {
            position++;
            if ((n & 1) == 1) {
                break;
            }
            n = n >> 1;
        }
        return position;
    }

    public static void main(String[] args) {
        System.out.println(v1(18));
        System.out.println(v1(12));
        System.out.println(v1(3365));
    }
}
