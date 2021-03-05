package com.javamultiplex.hashing;

import java.util.*;

/**
 * @author Rohit Agarwal on 05/03/21 11:45 pm
 * @copyright www.javamultiplex.com
 */
public class WinnerOfAnElection {

    //Time - O(n), Space - O(n)
    public static String[] winner(String[] arr, int n) {
        Map<String, Integer> map = new HashMap<>();
        for (String voter : arr) {
            if (map.containsKey(voter)) {
                Integer count = map.get(voter);
                map.put(voter, ++count);
            } else {
                map.put(voter, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new MapComparator());
        Map.Entry<String, Integer> winner = list.get(0);
        return new String[]{winner.getKey(), String.valueOf(winner.getValue())};
    }

    static class MapComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            if (o2.getValue() > o1.getValue()) {
                return 1;
            } else if (o2.getValue() < o1.getValue()) {
                return -1;
            } else {
                return o1.getKey().compareTo(o2.getKey());
            }
        }
    }
}
