package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 26/04/21 11:50 pm
 * @copyright www.javamultiplex.com
 */
public class BitwiseOperators {

    public static int and(int num1, int num2) {
        return num1 & num2;
    }

    public static int or(int num1, int num2) {
        return num1 | num2;
    }

    public static int xor(int num1, int num2) {
        return num1 ^ num2;
    }

    public static int not(int num1) {
        return ~num1;
    }

    public static int leftShift(int num, int times) {
        return num << times;
    }

    public static int signedRightShift(int num, int times) {
        return num >> times;
    }

    public static int unsignedRightShift(int num, int times) {
        return num >>> times;
    }

    public static void main(String[] args) {
        System.out.println(and(3, 6));//2
        System.out.println(or(3, 6));//7
        System.out.println(xor(3, 6));//5
        System.out.println(not(1));//-2
        System.out.println(not(5));//-6
        System.out.println(not(4));//-5
        System.out.println(leftShift(3, 1));//6
        System.out.println(leftShift(3, 2));//12
        System.out.println(leftShift(-1, 1));//-2
        System.out.println(leftShift(-1, 2));//-4
        System.out.println(signedRightShift(4, 1));//2
        System.out.println(signedRightShift(4, 2));//1
        System.out.println(signedRightShift(-2, 1));//-1
        System.out.println(signedRightShift(-2, 2));//-1
        System.out.println(unsignedRightShift(-2, 1));//2147483647
        System.out.println(unsignedRightShift(-2, 2));//1073741823
    }
}
