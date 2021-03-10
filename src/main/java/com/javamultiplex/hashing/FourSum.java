package com.javamultiplex.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author Rohit Agarwal on 08/03/21 10:59 pm
 * @copyright www.javamultiplex.com
 */
public class FourSum {

    //Time - O(n^4), Space - O(n^2)
    public static ArrayList<ArrayList<Integer>> method1(int[] arr, int k) {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int r = j + 1; r < n; r++) {
                    for (int s = r + 1; s < n; s++) {
                        if (arr[i] + arr[j] + arr[r] + arr[s] == k) {
                            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[r], arr[s]));
                            arrayLists.add(arrayList);
                        }
                    }
                }
            }
        }
        HashSet<ArrayList<Integer>> hashSets = new LinkedHashSet<>(arrayLists);
        arrayLists = new ArrayList<>(hashSets);
        return arrayLists;
    }

    //Time - O(n^3), Space - O(n^2)
    public static ArrayList<ArrayList<Integer>> method2(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        int n = arr.length;
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                int remainingSum = k - sum;
                int l = j + 1;
                int m = n - 1;
                while (l < m) {
                    if (arr[l] + arr[m] == remainingSum) {
                        arrayLists.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[l], arr[m])));
                        l++;
                        m--;
                    } else if (arr[l] + arr[m] < remainingSum) {
                        l++;
                    } else {
                        m--;
                    }
                }
            }
        }
        HashSet<ArrayList<Integer>> hashSet = new LinkedHashSet<>(arrayLists);
        arrayLists = new ArrayList<>(hashSet);
        return arrayLists;
    }
}
