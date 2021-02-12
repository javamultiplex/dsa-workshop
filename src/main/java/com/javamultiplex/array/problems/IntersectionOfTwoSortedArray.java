package com.javamultiplex.array.problems;

import java.util.ArrayList;

/**
 * @author Rohit Agarwal on 12/02/21 11:14 pm
 * @copyright www.javamultiplex.com
 */
public class IntersectionOfTwoSortedArray {
    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            int size = list.size();
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                if (size == 0 || list.get(size - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return list;
    }
}
