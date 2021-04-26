package com.javamultiplex.dsa.mathematics;

/**
 * @author Rohit Agarwal on 22/04/21 11:42 pm
 * @copyright www.javamultiplex.com
 */

public class PalindromeNumbers {

    /*
    formula = floor(n/5)+floor(n/25)+floor(n/125)
     */
    //TC - theta(log(n))
    public static boolean v1(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        return n == rev;
    }

    public static void main(String[] args) {
        System.out.println(v1(123));
        System.out.println(v1(1221));
        System.out.println(v1(1001));

    }
}
