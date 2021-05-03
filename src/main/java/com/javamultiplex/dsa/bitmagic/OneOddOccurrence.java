package com.javamultiplex.dsa.bitmagic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rohit Agarwal on 02/05/21 12:01 am
 * @copyright www.javamultiplex.com
 */
public class OneOddOccurrence {

    //TC - O(n^2), SC - O(1)
    public static int v1(int[] arr) {
        int count;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return arr[i];
            }
        }
        return -1;
    }

    //TC - O(n), SC - O(n)
    public static int v2(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                Integer count = map.get(arr[i]);
                map.put(arr[i], ++count);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return -1;
    }

    //TC - O(n), SC - O(1)
    public static int v3(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(v1(new int[]{1, 1, 3, 3, 4, 4, 4, 8, 8}));
        System.out.println(v2(new int[]{1, 1, 3, 3, 4, 4, 4, 8, 8}));
        System.out.println(v3(new int[]{1, 1, 3, 3, 4, 4, 4, 8, 8}));
    }
}
