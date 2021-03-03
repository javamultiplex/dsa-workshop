package com.javamultiplex.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rohit Agarwal on 02/03/21 11:27 pm
 * @copyright www.javamultiplex.com
 */
public class TwoSum {

    //Time - O(n), Space - O(n)
    public static boolean keypair(int[] A, int N, int X) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (set.contains(X - A[i])) {
                return true;
            } else {
                set.add(A[i]);
            }
        }
        return false;
    }
}
