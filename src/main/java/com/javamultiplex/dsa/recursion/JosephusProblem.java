package com.javamultiplex.dsa.recursion;

/**
 * @author Rohit Agarwal on 23/05/21 2:17 pm
 * @copyright www.javamultiplex.com
 */
public class JosephusProblem {
    //TC - O(n)
    //In this solution position starts from 0
    public static int jos0(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jos0(n - 1, k) + k) % n;
    }

    //In this solution position starts from 1
    public static int jos1(int n, int k) {
        return jos0(n, k) + 1;
    }

    public static void main(String[] args) {
        System.out.println(jos0(5, 3));
        System.out.println(jos0(6, 3));
        System.out.println(jos0(7, 3));
    }
}
