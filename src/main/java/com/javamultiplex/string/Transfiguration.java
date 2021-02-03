package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 03/02/21 10:53 pm
 * @copyright www.javamultiplex.com
 */

import java.util.Arrays;

/**
 * Professor McGonagall teaches transfiguration at Hogwarts. She has given Harry the task of changing himself into a cat. She explains that the trick is to analyze your own DNA and change it into the DNA of a cat. The transfigure spell can be used to pick any one character from the DNA string, remove it and insert it in the beginning.
 * Help Harry calculates minimum number of times he needs to use the spell to change himself into a cat.
 * <p>
 * Input:
 * A = "GEEKSFORGEEKS"
 * B = "FORGEEKSGEEKS"
 * Output: 3
 * Explanation:The conversion can take place
 * in 3 operations:
 * 1. Pick 'R' and place it at the front,
 * A="RGEEKSFOGEEKS"
 * 2. Pick 'O' and place it at the front,
 * A="ORGEEKSFGEEKS"
 * 3. Pick 'F' and place it at the front,
 * A="FORGEEKSGEEKS"
 */
public class Transfiguration {

    public static int transfigure(String A, String B) {
        int n = A.length() - 1, m = B.length() - 1;
        if (!Arrays.equals(A.chars().sorted().toArray(), B.chars().sorted().toArray())) {
            return -1;
        }
        int count = 0;
        while (n >= 0) {
            if (A.charAt(n) == B.charAt(m)) {
                m--;
                count++;
            }
            n--;
        }
        return A.length() - count;
    }

}
