package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 30/03/21 11:18 pm
 * @copyright www.javamultiplex.com
 */
public class LowerCaseToUpperCase {

    public static String toUpperCase(String str) {
        int length = str.length();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                int c = ch - 32;
                output.append((char) c);
            } else {
                output.append(ch);
            }
        }
        return output.toString();
    }
}
