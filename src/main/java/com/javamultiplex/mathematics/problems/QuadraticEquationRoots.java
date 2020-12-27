package com.javamultiplex.mathematics.problems;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rohit Agarwal on 16/12/20 11:12 pm
 * @copyright www.javamultiplex.com
 */
public class QuadraticEquationRoots {

    //    (-b+sqrt(b^2-4ac))/2a
    //    (-b-sqrt(b^2-4ac))/2a
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<>();
        //Roots are imaginary
        if (b * b < 4 * a * c) {
            roots.add(-1);
        } else {
            //Roots are real
            double b24ac = Math.sqrt((b * b) - (4 * a * c));
            int x = (int) Math.floor((-b + b24ac) / (2 * a));
            int y = (int) Math.floor((-b - b24ac) / (2 * a));
            roots.add(x);
            roots.add(y);
            roots.sort(Collections.reverseOrder());
        }
        return roots;
    }

}
