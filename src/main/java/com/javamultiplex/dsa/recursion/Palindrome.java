package com.javamultiplex.dsa.recursion;

/**
 * @author Rohit Agarwal on 19/03/21 11:40 pm
 * @copyright www.javamultiplex.com
 */
public class Palindrome {

    public static boolean isPalindromeIterative(int n) {
        String input = String.valueOf(n);
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(int n) {
        String input = String.valueOf(n);
        return isPalindromeRecursive(input, 0, input.length() - 1);
    }

    private static boolean isPalindromeRecursive(String input, int left, int right) {
        if (left >= right) {
            return true;
        } else {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            return isPalindromeRecursive(input, ++left, --right);
        }
    }

}
