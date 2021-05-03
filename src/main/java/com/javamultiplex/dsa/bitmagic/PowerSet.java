package com.javamultiplex.dsa.bitmagic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 04/05/21 12:06 am
 * @copyright www.javamultiplex.com
 */
public class PowerSet {

    //TC - theta(2^n * n), SC - O(1)
    public static List<String> v1(String input) {
        List<String> list = new ArrayList<>();
        int n = input.length();
        int m = (int) (Math.pow(2, n) - 1);
        StringBuilder temp;
        for (int i = 0; i <= m; i++) {
            temp = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    temp.append(input.charAt(j));
                }
            }
            list.add(temp.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(v1("abc"));
        System.out.println(v1("abcd"));
    }
}
