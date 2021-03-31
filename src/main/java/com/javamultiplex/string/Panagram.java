package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 31/03/21 11:30 pm
 * @copyright www.javamultiplex.com
 */
public class Panagram {
    public static boolean isPanagram(String str) {
        for (int i = 97; i <= 122; i++) {
            if (!str.toLowerCase().contains(String.valueOf((char) i))) {
                return false;
            }
        }
        return true;
    }
}
