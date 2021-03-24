package com.javamultiplex.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 24/03/21 10:31 pm
 * @copyright www.javamultiplex.com
 */
public class NaivePatternSearchingAlgorithm {

    //Time - O((n-m+1)*m), Space - O(1)
    public static List<Integer> search(String text, String pattern) {
        List<Integer> list = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        int j = 0;
        for (int i = 0; i <= (n - m); i++) {
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                list.add(i);
            }
        }
        return list;
    }
}
