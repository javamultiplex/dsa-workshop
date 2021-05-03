package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 02/05/21 11:41 pm
 * @copyright www.javamultiplex.com
 */
public class TwoOddOccurrence {

    //TC - O(n^2), SC - O(1)
    public static void v1(int[] arr) {
        int n = arr.length;
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] != 0 && arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(arr[i]);
                arr[i] = 0;
            }
        }
    }

    //TC - O(n), SC - O(1)
    public static void v2(int[] arr) {
        int xor = 0;
        int n = arr.length;
        int res1 = 0, res2 = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        int rightMostSetBit = xor & ~(xor - 1);
        for (int i = 0; i < n; i++) {
            if ((arr[i] & rightMostSetBit) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }

        System.out.println(res1);
        System.out.println(res2);
    }

    public static void main(String[] args) {
        v1(new int[]{4, 3, 3, 3, 4, 5, 6, 6});
        v2(new int[]{4, 3, 3, 3, 4, 5, 6, 6});
    }

}
