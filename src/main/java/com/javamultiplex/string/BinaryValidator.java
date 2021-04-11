package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 11/04/21 11:37 am
 * @copyright www.javamultiplex.com
 */
public class BinaryValidator {
    public static boolean isBinary(String str) {
        String regex = "^[01]+$";
        return str.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isBinary("101"));
        System.out.println(isBinary("123"));
    }
}
