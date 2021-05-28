package com.javamultiplex.dsa.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 28/05/21 11:43 pm
 * @copyright www.javamultiplex.com
 */
public class PossibleWordsPhoneDigits {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    static ArrayList<String> possibleWords(int[] a, int N) {
        ArrayList<String> output = new ArrayList<>();
        possibleWords(a, N, "", 0, output);
        return output;
    }

    private static void possibleWords(int[] a, int n, String osf, int index, ArrayList<String> output) {
        if (index == n) {
            output.add(osf);
            return;
        }
        String string = map.get(a[index]);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            possibleWords(a, n, osf + string.charAt(i), index + 1, output);
        }
    }

    public static void main(String[] args) {
        System.out.println(possibleWords(new int[]{2, 3}, 2));
        System.out.println(possibleWords(new int[]{2, 3, 4}, 3));
    }
}
