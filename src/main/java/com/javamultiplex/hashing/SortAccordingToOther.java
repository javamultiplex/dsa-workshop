package com.javamultiplex.hashing;

import java.util.*;

/**
 * @author Rohit Agarwal on 04/03/21 11:07 pm
 * @copyright www.javamultiplex.com
 */
public class SortAccordingToOther {

    //Time - O(nlog(n)), Space - O(n)
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
        int[] output = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(A1[i])) {
                Integer count = map.get(A1[i]);
                map.put(A1[i], ++count);
            } else {
                map.put(A1[i], 1);
            }
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < M; i++) {
            set.add(A2[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Integer e = iterator.next();
            if (map.containsKey(e)) {
                int count = map.get(e);
                while (count != 0) {
                    output[i++] = e;
                    count--;
                }
                map.remove(e);
            }
        }

        List<Integer> integers = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            while (count != 0) {
                integers.add(entry.getKey());
                count--;
            }
        }

        Collections.sort(integers);

        for (Integer integer : integers) {
            output[i++] = integer;
        }
        return output;
    }
}
