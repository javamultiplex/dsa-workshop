package com.javamultiplex.problemoftheday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Rohit Agarwal on 17/04/21 5:07 pm
 * @copyright www.javamultiplex.com
 */
public class GrayCode {

    public static ArrayList<String> grayCode(int n) {
        if (n == 1) {
            return new ArrayList<>(Arrays.asList("0", "1"));
        }
        ArrayList<String> list = grayCode(n - 1);
        ArrayList<String> output = new ArrayList<>();
        for (String s : list) {
            output.add("0" + s);
        }
        Collections.reverse(list);
        for (String s : list) {
            output.add("1" + s);
        }
        return output;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = grayCode(3);
        System.out.println(strings);
    }
}
