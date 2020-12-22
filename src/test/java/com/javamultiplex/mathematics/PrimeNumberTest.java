package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 12/12/20 11:23 pm
 * @copyright www.javamultiplex.com
 */
public class PrimeNumberTest {

    @Test
    public void shouldValidateGivenPrimeNumber() {
        assertFalse(PrimeNumber.isPrime(1));
        assertTrue(PrimeNumber.isPrime(2));
        assertTrue(PrimeNumber.isPrime(17));
        assertFalse(PrimeNumber.isPrime(4));
        assertFalse(PrimeNumber.isPrime(25));
        assertTrue(PrimeNumber.isPrime(11));
    }

    @Test
    public void shouldGetAllPrimeNumbers() {
        List<Integer> list1 = PrimeNumber.getAllPrimeNumbers(7);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7), list1);

        List<Integer> list2 = PrimeNumber.getAllPrimeNumbers(15);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13), list2);
    }

    @Test
    public void shouldGetAllPrimeNumbersUsingSeiveAlgorithm() {
        List<Integer> list1 = PrimeNumber.getAllPrimeNumbersUsingSimpleSeiveAlgorithm(7);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7), list1);

        List<Integer> list2 = PrimeNumber.getAllPrimeNumbersUsingSimpleSeiveAlgorithm(15);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13), list2);
    }
}

