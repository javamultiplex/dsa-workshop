package com.javamultiplex.recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rohit Agarwal on 10/04/21 10:49 pm
 * @copyright www.javamultiplex.com
 */
public class Permutations {

    public static void permutationsWithDistinctCharacters(String string, String permutation) {
        int length = string.length();
        if (length == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            String restOfString = string.substring(0, i) + string.substring(i + 1);
            permutationsWithDistinctCharacters(restOfString, permutation + ch);
        }

    }

    public static void permutationsWithDuplicateCharacters(String string, String permutation) {
        int length = string.length();
        if (length == 0) {
            System.out.println(permutation);
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            if (!set.contains(ch)) {
                String restOfString = string.substring(0, i) + string.substring(i + 1);
                set.add(ch);
                permutationsWithDuplicateCharacters(restOfString, permutation + ch);
            }
        }

    }

    public static void main(String[] args) {
        permutationsWithDistinctCharacters("ABC", "");
        permutationsWithDuplicateCharacters("AAC", "");
    }
}
