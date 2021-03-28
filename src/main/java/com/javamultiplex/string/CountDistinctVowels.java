package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 24/03/21 11:25 pm
 * @copyright www.javamultiplex.com
 */
public class CountDistinctVowels {

    public static int countVowels(String str) {
        int length = str.length();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < length; j++) {
            if (str.charAt(j) == 'a' && a == 0) {
                a++;
            } else if (str.charAt(j) == 'i' && i == 0) {
                i++;
            } else if (str.charAt(j) == 'e' && e == 0) {
                e++;
            } else if (str.charAt(j) == 'o' && o == 0) {
                o++;
            } else if (str.charAt(j) == 'u' && u == 0) {
                u++;
            }
        }
        return a + e + i + o + u;
    }
}
