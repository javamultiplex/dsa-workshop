package com.javamultiplex.array.algorithms;

import com.javamultiplex.mathematics.problems.GCD;

/**
 * @author Rohit Agarwal on 27/12/20 3:57 pm
 * @copyright www.javamultiplex.com
 */
public class JugglingAlgorithm {
    //Time - O(n), Space - O(1)
    public static void leftRotate(int[] arr, int n, int d) {
        int sets = GCD.gcd(n, d);
        int temp;
        for (int i = 0; i < sets; i++) {
            temp = arr[i];
            int j = i;
            while (true) {
                int next = (j + d) % n;
                if (next == i) {
                    break;
                } else {
                    arr[j] = arr[next];
                    j = next;
                }
            }
            arr[j] = temp;
        }
    }
}
