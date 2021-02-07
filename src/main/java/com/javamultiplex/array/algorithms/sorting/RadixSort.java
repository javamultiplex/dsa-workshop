package com.javamultiplex.array.algorithms.sorting;

import com.javamultiplex.array.problems.MaxElementInArray;
import com.javamultiplex.mathematics.problems.NumberOfDigitsInNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rohit Agarwal on 06/02/21 10:46 pm
 * @copyright www.javamultiplex.com
 */
public class RadixSort {
    public static void sort(int[] arr, int n) {
        int max = MaxElementInArray.find(arr, n);
        int digits = NumberOfDigitsInNumber.method2(max);
        for (int radix = 0; radix < digits; radix++) {
            Map<Integer, List<Integer>> bucket = createBucket(arr, n, radix);
            int j = 0;
            for (Map.Entry<Integer, List<Integer>> entry : bucket.entrySet()) {
                List<Integer> v = entry.getValue();
                for (Integer integer : v) {
                    arr[j++] = integer;
                }
            }
        }
    }

    private static Map<Integer, List<Integer>> createBucket(int[] arr, int n, int radix) {
        Map<Integer, List<Integer>> bucket = new HashMap<>();
        for (int j = 0; j < n; j++) {
            int faceValue = (arr[j] / (int) Math.pow(10, radix)) % 10;
            List<Integer> values;
            if (bucket.containsKey(faceValue)) {
                values = bucket.get(faceValue);
            } else {
                values = new ArrayList<>();
            }
            values.add(arr[j]);
            bucket.put(faceValue, values);
        }
        return bucket;
    }
}
