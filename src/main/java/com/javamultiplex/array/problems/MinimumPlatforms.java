package com.javamultiplex.array.problems;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 14/02/21 11:07 am
 * @copyright www.javamultiplex.com
 */
public class MinimumPlatforms {

    //Time - O(nlog(n)), Space - O(1)
    public static int method1(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0;
        int maxPlatforms = 1, neededPlatforms = 1;
        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                maxPlatforms++;
                i++;
            } else {
                maxPlatforms--;
                j++;
            }

            if (neededPlatforms < maxPlatforms) {
                neededPlatforms = maxPlatforms;
            }
        }
        return neededPlatforms;
    }
}
