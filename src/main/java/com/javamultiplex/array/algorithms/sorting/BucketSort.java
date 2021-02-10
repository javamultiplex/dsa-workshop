package com.javamultiplex.array.algorithms.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rohit Agarwal on 06/02/21 10:46 pm
 * @copyright www.javamultiplex.com
 */
public class BucketSort {

    //Time - O(n*n), Space - O(k)
    public static void sort(double[] arr) {
        Map<Integer, List<Double>> bucket = new HashMap<>();
        for (double v : arr) {
            int digit = getFirstDigitAfterDecimalPoint(v);
            List<Double> list;
            if (bucket.containsKey(digit)) {
                list = bucket.get(digit);
                list.add(v);
                if (list.size() > 1) {
                    insertionSort(list);
                }
            } else {
                list = new ArrayList<>();
                list.add(v);
            }
            bucket.put(digit, list);
        }

        int j = 0;
        for (Map.Entry<Integer, List<Double>> entry : bucket.entrySet()) {
            List<Double> list = entry.getValue();
            for (Double aDouble : list) {
                arr[j++] = aDouble;
            }
        }
    }


    private static void insertionSort(List<Double> list) {
        int size = list.size();
        int i = size - 2;
        double temp = list.get(size - 1);
        while (i >= 0 && list.get(i) > temp) {
            list.set(i + 1, list.get(i));
            i--;
        }
        list.set(i + 1, temp);
    }

    private static int getFirstDigitAfterDecimalPoint(double d) {
        return String.valueOf(d).charAt(2) - 48;
    }
}
