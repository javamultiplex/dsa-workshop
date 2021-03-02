package com.javamultiplex.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 02/03/21 10:51 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayEqualOrNot {

    //Time - O(n), Space - O(n)
    public static boolean check(int[] arr, int[] brr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                Integer count = map.get(arr[i]);
                map.put(arr[i], ++count);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(brr[i])) {
                return false;
            }
            Integer count = map.get(brr[i]);
            if (count <= 0) {
                return false;
            }
            map.put(brr[i], --count);
        }
        return true;
    }
}
