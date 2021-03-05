package com.javamultiplex.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 05/03/21 11:32 pm
 * @copyright www.javamultiplex.com
 */
public class FirstNonRepeatingCharacter {

    //Time - O(n), Space - O(n)
    public static char nonRepeatingCharacter(String S) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : S.toCharArray()) {
            if (map.containsKey(ch)) {
                Integer count = map.get(ch);
                map.put(ch, ++count);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '$';
    }
}
