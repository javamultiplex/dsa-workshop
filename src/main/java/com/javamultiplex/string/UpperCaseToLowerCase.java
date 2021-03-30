package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 30/03/21 11:28 pm
 * @copyright www.javamultiplex.com
 */
public class UpperCaseToLowerCase {

    public static String toLowerCase(String str) {
        int length = str.length();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                int c = ch + 32;
                output.append((char) c);
            } else {
                output.append(ch);
            }
        }
        return output.toString();
    }
}
