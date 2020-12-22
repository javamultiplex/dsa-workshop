package com.javamultiplex.mathematics;

import java.util.List;

/**
 * @author Rohit Agarwal on 18/12/20 10:33 pm
 * @copyright www.javamultiplex.com
 */
public class Exactly3Divisors {

    //This will not work for large input
    public static int getExactly3DivisorsUsingSimpleSeive(int N) {
        int count = 0;
        List<Integer> list = PrimeNumber.getAllPrimeNumbersUsingSimpleSeiveAlgorithm(N);
        for (Integer item : list) {
            long square = (long) item * item;
            if (square <= N) {
                count++;
            }
        }
        return count;
    }

    public static int getExactly3Divisors(int N) {
        int count = 0;
        for (int i = 2; i * i <= N; i++) {
            if (PrimeNumber.isPrime(i)) {
                if (i * i <= N) {
                    count++;
                }
            }
        }
        return count;
    }
}
