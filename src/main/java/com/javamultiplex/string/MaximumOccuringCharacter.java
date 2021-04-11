package com.javamultiplex.string;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Rohit Agarwal on 11/04/21 11:45 am
 * @copyright www.javamultiplex.com
 */
public class MaximumOccuringCharacter {
    public static char getMaxOccuringChar(String line) {
        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = line.toCharArray();
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                Integer count = map.get(ch);
                map.put(ch, ++count);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        int max = 0;
        char ch = '\u0000';
        for (Map.Entry<Character, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value > max) {
                max = value;
                ch = entry.getKey();
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        System.out.println(getMaxOccuringChar("testsample"));
        System.out.println(getMaxOccuringChar("output"));
    }
}
