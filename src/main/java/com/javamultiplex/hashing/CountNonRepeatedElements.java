package com.javamultiplex.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 05/03/21 6:46 pm
 * @copyright www.javamultiplex.com
 */
public class CountNonRepeatedElements {

    //Time - O(n), Space - O(n)
    public static long countNonRepeated(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if (map.containsKey(element)) {
                Integer count = map.get(element);
                map.put(element, ++count);
            } else {
                map.put(element, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        return count;
    }
}
