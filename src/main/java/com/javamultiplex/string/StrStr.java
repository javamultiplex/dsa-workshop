package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 13/04/21 8:37 pm
 * @copyright www.javamultiplex.com
 */

//Your task is to implement the function strstr.
// The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s.
// The function returns and integer denoting the first occurrence of the string x in s (0 based indexing).
public class StrStr {
    public static int strstr(String s, String x) {
        int n = s.length();
        int m = x.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (x.charAt(j) != s.charAt(j + i)) {
                    break;
                }
            }

            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strstr("GeeksForGeeks", "Fr"));
        System.out.println(strstr("GeeksForGeeks", "For"));
    }
}
