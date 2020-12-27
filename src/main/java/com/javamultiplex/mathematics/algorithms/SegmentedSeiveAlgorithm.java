package com.javamultiplex.mathematics.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 25/12/20 7:35 pm
 * @copyright www.javamultiplex.com
 */
public class SegmentedSeiveAlgorithm {

    public static final int LIMIT = (int) (Math.floor(Math.sqrt(Math.pow(10, 9))));

    public static List<Integer> primes(int L, int R) {
        List<Integer> list = new ArrayList<>();
        List<Integer> primes = primes();
        int size = R - L + 1;
        boolean[] prime = new boolean[size];
        Arrays.fill(prime, true);
        for (int i = 0; primes.get(i) * primes.get(i) <= R; i++) {
            int currentPrime = primes.get(i);
            int base = (L / currentPrime) * currentPrime;
            if (base < L) {
                base = base + currentPrime;
            }
            for (int j = base; j <= R; j = j + currentPrime) {
                prime[j - L] = false;
            }

            if (base == currentPrime) {
                prime[base - L] = true;
            }
        }

        for (int i = 0; i < size; i++) {
            if (prime[i]) {
                list.add(L + i);
            }
        }
        return list;
    }

    public static List<Integer> primes() {
        List<Integer> list = new ArrayList<>();
        boolean[] prime = new boolean[LIMIT + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= LIMIT; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= LIMIT; i++) {
            if (prime[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
