package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 31/03/21 11:37 pm
 * @copyright www.javamultiplex.com
 */
public class MissingCharacterInPanagram {

    public static String find(String str) {
        StringBuilder output = new StringBuilder();
        String temp = str.toLowerCase();
        for (int i = 97; i <= 122; i++) {
            String character = String.valueOf((char) i);
            if (!temp.contains(character)) {
                output.append(character);
            }
        }

        if (output.length() == 0) {
            return "-1";
        } else {
            return output.toString();
        }
    }
}
