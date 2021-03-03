package com.javamultiplex.hashing;

import java.util.*;

/**
 * @author Rohit Agarwal on 03/03/21 11:54 pm
 * @copyright www.javamultiplex.com
 */
public class TopKFrequentElements {

    //Time - O(nlog(n)), Space - O(n)
    public static int[] topK(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                Integer count = map.get(nums[i]);
                map.put(nums[i], ++count);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new MapComparator());
        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = list.get(i).getKey();
        }
        return output;
    }


    static class MapComparator implements Comparator<Map.Entry<Integer, Integer>> {
        @Override
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
            if (o2.getValue() > o1.getValue()) {
                return 1;
            } else if (o2.getValue() < o1.getValue()) {
                return -1;
            } else {
                return Integer.compare(o2.getKey(), o1.getKey());
            }
        }
    }

}
