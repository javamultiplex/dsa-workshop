package com.javamultiplex.hashing;

import java.util.*;

/**
 * @author Rohit Agarwal on 04/03/21 10:39 pm
 * @copyright www.javamultiplex.com
 */
public class SortByFrequency {

    //Time - O(nlog(n)), Space - O(n)
    public static ArrayList<Integer> sortByFreq(int[] nums, int n) {
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
        ArrayList<Integer> output = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            Integer count = entry.getValue();
            Integer key = entry.getKey();
            while (count != 0) {
                output.add(key);
                count--;
            }
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
                return Integer.compare(o1.getKey(), o2.getKey());
            }
        }
    }
}
