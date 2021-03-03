package com.javamultiplex.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 03/03/21 11:26 pm
 * @copyright www.javamultiplex.com
 */
public class NonRepeatedElements {

    //Time - O(n), Space - O(n)
    public static ArrayList<Integer> printNonRepeated(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                Integer count = map.get(arr[i]);
                map.put(arr[i], ++count);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
