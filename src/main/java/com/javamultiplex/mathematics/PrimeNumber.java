package com.javamultiplex.mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 12/12/20 11:18 pm
 * @copyright www.javamultiplex.com
 */
public class PrimeNumber {

    //O(sqrt(n))
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //O(n*sqrt(n))
    public static List<Integer> getAllPrimeNumbers(int number) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static List<Integer> getAllPrimeNumbersUsingSeiveAlgorithm(int number) {
        return SeiveAlgorithm.getAllPrimeNumbers(number);
    }
}
