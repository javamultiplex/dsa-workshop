package com.javamultiplex.string;

import java.util.List;

/**
 * @author Rohit Agarwal on 28/03/21 3:13 pm
 * @copyright www.javamultiplex.com
 */
public class SubsequenceValidator {

    //Time - O(n*2^n)
    public static boolean method1(String input, String subsequence) {
        List<String> subsequences = SubsequenceGenerator.subsequences(input);
        return subsequences.contains(subsequence);
    }


    //Time - O(n+m)
    public static boolean method2Iterative(String input, String subsequence) {
        int i = 0, j = 0;
        int m = subsequence.length();
        int n = input.length();
        boolean result = false;
        while (i < n && j < m) {
            if (input.charAt(i) == subsequence.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == m) {
            result = true;
        }
        return result;
    }
}
