package com.javamultiplex.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 23/05/21 3:35 pm
 * @copyright www.javamultiplex.com
 */
public class Permutation {

    public static void v1(String string, String osf) {
        if (string.length() == 0) {
            System.out.println(osf);
            return;
        }
        int n = string.length();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!list.contains(string.charAt(i))) {
                list.add(string.charAt(i));
                String temp = string.substring(0, i) + string.substring(i + 1, n);
                v1(temp, osf + string.charAt(i));
            }
        }
    }

    public static void v2(String string, int index) {
        if (index == string.length() - 1) {
            System.out.println(string);
            return;
        }
        int n = string.length();
        for (int j = index; j < n; j++) {
            string = swap(string, j, index);
            v2(string, index + 1);
            string = swap(string, index, j);
        }
    }

    private static String swap(String string, int i, int j) {
        char[] chars = string.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public static void main(String[] args) {
        v2("ABC", 0);
    }
}
