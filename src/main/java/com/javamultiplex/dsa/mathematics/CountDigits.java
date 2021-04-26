package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 23/04/21 12:12 am
 * @copyright www.javamultiplex.com
 */
public class CountDigits {

    //TC - theta(log(n)), SC - theta(1)
    public static int v1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    //TC - theta(log(n)), SC - theta(log(n))
    public static int v2(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + v2(n / 10);
    }

    public static int v3(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        System.out.println(v1(123));
        System.out.println(v1(34999));

        System.out.println(v2(123));
        System.out.println(v2(34999));

        System.out.println(v3(123));
        System.out.println(v3(34999));
    }

}
