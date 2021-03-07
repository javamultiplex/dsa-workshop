package com.javamultiplex.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 07/03/21 10:53 pm
 * @copyright www.javamultiplex.com
 */
public class LargestSubArrayWith0Sum {
    //Time - O(n), Space - O(n)
    public static int maxLen(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for (int currentIndex = 0; currentIndex < n; currentIndex++) {
            sum += arr[currentIndex];
            if (map.containsKey(sum)) {
                Integer previousIndex = map.get(sum);
                int subArraySize = currentIndex - previousIndex;
                if (subArraySize > max) {
                    max = subArraySize;
                }
            } else {
                map.put(sum, currentIndex);
            }
        }
        return max;
    }
}
