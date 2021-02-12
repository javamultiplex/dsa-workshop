package com.javamultiplex.array.problems;

import java.util.ArrayList;

/**
 * @author Rohit Agarwal on 12/02/21 10:47 pm
 * @copyright www.javamultiplex.com
 */
public class UnionOfTwoSortedArray {

    //Time - O(m+n), Space - O(m+n)
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            int size = list.size();
            if (arr1[i] < arr2[j]) {
                if (size == 0 || list.get(size - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (size == 0 || list.get(size - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            } else {
                if (size == 0 || list.get(size - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            int size = list.size();
            if (list.get(size - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < m) {
            int size = list.size();
            if (list.get(size - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }

}
