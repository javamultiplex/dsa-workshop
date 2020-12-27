package com.javamultiplex.mathematics.problems;

/**
 * @author Rohit Agarwal on 15/12/20 9:18 pm
 * @copyright www.javamultiplex.com
 */
//This problem statement is same as find LCM of first n natural numbers.
public class SmallestDivisibleNumber {

    public static long method1(int number) {
        if (number < 3) {
            return number;
        }
        long lcm = number;
        for (int i = number - 1; i >= 1; i--) {
            lcm = LCM.getLCM(lcm, i);
        }
        return lcm;
    }
}
