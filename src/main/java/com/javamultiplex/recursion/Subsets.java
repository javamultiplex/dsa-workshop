package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 21/05/21 11:34 am
 * @copyright www.javamultiplex.com
 */
public class Subsets {

    //TS - O(2^n)
    public static void subsets(String string, int index, String osf) {
        if (index == string.length()) {
            System.out.println(osf);
            return;
        }
        subsets(string, index + 1, osf);
        subsets(string, index + 1, osf + string.charAt(index));
    }

    public static void main(String[] args) {
        subsets("ABC", 0, "");
    }
}
