package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 31/03/21 11:30 pm
 * @copyright www.javamultiplex.com
 */
public class Panagram {
    public static boolean isPanagram(String str) {
        String temp = str.toLowerCase();
        for (int i = 97; i <= 122; i++) {
            if (!temp.contains(String.valueOf((char) i))) {
                return false;
            }
        }
        return true;
    }
}
