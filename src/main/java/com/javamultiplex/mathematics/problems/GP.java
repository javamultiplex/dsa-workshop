package com.javamultiplex.mathematics.problems;

/**
 * @author Rohit Agarwal on 18/12/20 10:04 pm
 * @copyright www.javamultiplex.com
 */
public class GP {

    public static double nthTerm(int firstTerm, int secondTerm, int N) {
        double r = (double) secondTerm / firstTerm;
        return Math.floor(firstTerm * Math.pow(r, N - 1));
    }
}
