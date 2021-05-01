package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 01/05/21 8:38 pm
 * @copyright www.javamultiplex.com
 */
public class PowerOfTwo {

    public static boolean v1(int n) {
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    public static boolean v2(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count == 1;
    }

    public static boolean v3(int n) {
        return (n != 0) && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println("v1()");
        System.out.println(v1(4));
        System.out.println(v1(6));
        System.out.println(v1(8));
        System.out.println(v1(10));
        System.out.println("v2()");
        System.out.println(v2(4));
        System.out.println(v2(6));
        System.out.println(v2(8));
        System.out.println(v2(10));
        System.out.println("v3()");
        System.out.println(v3(4));
        System.out.println(v3(6));
        System.out.println(v3(8));
        System.out.println(v3(10));
    }

}
