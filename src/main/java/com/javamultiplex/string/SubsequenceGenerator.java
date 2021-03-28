package com.javamultiplex.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Rohit Agarwal on 28/03/21 2:06 pm
 * @copyright www.javamultiplex.com
 */
public class SubsequenceGenerator {

    private static final String BLANK = "";

    public static List<String> subsequences(String input) {
        ArrayList<String> output = new ArrayList<>();
        subsequences(input, output);
        output.add(BLANK);
        output.sort(new StringComparator());
        return output;
    }

    public static void subsequences(String input, List<String> output) {
        if (input.length() == 0) {
            return;
        } else {
            int length = input.length();
            char lastCharacter = input.charAt(length - 1);
            List<String> temp = new ArrayList<>();
            temp.add(String.valueOf(lastCharacter));
            if (!output.isEmpty()) {
                for (String str : output) {
                    temp.add(lastCharacter + str);
                }
            }
            output.addAll(temp);
            subsequences(input.substring(0, length - 1), output);
        }
    }

    private static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() > o2.length()) {
                return 1;
            } else {
                return o1.compareTo(o2);
            }
        }
    }
}
