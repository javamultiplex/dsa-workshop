package com.javamultiplex.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 02/03/21 11:11 pm
 * @copyright www.javamultiplex.com
 */
public class MaximumDistanceBetweenSameElements {
    public static int maxDistance(int[] arr, int n) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] brr;
            if (map.containsKey(arr[i])) {
                brr = map.get(arr[i]);
            } else {
                brr = new int[2];
                brr[0] = i;
            }
            brr[1] = i;
            map.put(arr[i], brr);
        }

        int max = Integer.MIN_VALUE;
        int distance = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] value = entry.getValue();
            distance = value[1] - value[0];
            if (distance > max) {
                max = distance;
            }
        }
        return max;
    }
}
