package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 14/05/21 11:22 pm
 * @copyright www.javamultiplex.com
 */
public class SumOfDigits {

    //TC - theta(d), SC - theta(d) where d is number of digits in number
    public static int v1(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + v1(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(v1(123));//6
        System.out.println(v1(12345));//15
        System.out.println(v1(10));//1
    }
}
