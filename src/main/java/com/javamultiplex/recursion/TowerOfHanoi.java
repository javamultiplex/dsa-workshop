package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 21/05/21 12:15 pm
 * @copyright www.javamultiplex.com
 */
public class TowerOfHanoi {

    //TC - O((2^n)-1)
    public static void toh(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        toh(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        toh(n - 1, B, A, C);

    }

    public static void main(String[] args) {
        toh(1, 'A', 'B', 'C');
        System.out.println("-------------------");
        toh(2, 'A', 'B', 'C');
        System.out.println("-------------------");
        toh(3, 'A', 'B', 'C');
    }
}
