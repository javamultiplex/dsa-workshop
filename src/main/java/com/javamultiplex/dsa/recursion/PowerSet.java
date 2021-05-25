package com.javamultiplex.dsa.recursion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rohit Agarwal on 25/05/21 11:43 pm
 * @copyright www.javamultiplex.com
 */
public class PowerSet {
    static ArrayList<String> powerSet(String s) {
        ArrayList<String> output = new ArrayList<>();
        powerSet(s, 0, "", output);
        Collections.sort(output);
        return output;
    }

    public static void powerSet(String s, int index, String osf, ArrayList<String> output) {
        if (index == s.length()) {
            output.add(osf);
            return;
        }
        powerSet(s, index + 1, osf + s.charAt(index), output);
        powerSet(s, index + 1, osf, output);
    }

    public static void main(String[] args) {
        ArrayList<String> list = powerSet("abc");
        System.out.println(list);
    }

}
