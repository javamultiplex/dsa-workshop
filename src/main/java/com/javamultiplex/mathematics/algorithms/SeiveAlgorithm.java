package com.javamultiplex.mathematics.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 25/12/20 7:16 pm
 * @copyright www.javamultiplex.com
 */
public class SeiveAlgorithm {

    //This won't work for large input, we can use segmented seive instead
    public static List<Integer> getAllPrimeNumbers(int number) {
        boolean[] prime = new boolean[number + 1];
        List<Integer> primeNumbers = new ArrayList<>();
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= number; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= number; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
