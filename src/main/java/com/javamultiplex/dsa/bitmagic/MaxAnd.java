package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 31/05/21 12:15 am
 * @copyright www.javamultiplex.com
 */
public class MaxAnd {
    public static int maxAND(int[] arr, int N) {
        int res = 0;
        for (int bit = 31; bit >= 0; bit--) {
            int count = checkBit(res | (1 << bit), arr, N);
            if (count >= 2) {
                res = res | (1 << bit);
            }
        }
        return res;
    }

    private static int checkBit(int pattern, int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((pattern & arr[i]) == pattern) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxAND(new int[]{4, 8, 6, 2}, 4));
        System.out.println(maxAND(new int[]{4, 8, 12, 16}, 4));
        System.out.println(maxAND(new int[]{4, 8, 16, 2}, 4));
    }

}
