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
public class FindPrimeNumberTest {

    private FindPrimeNumber findPrimeNumber;

    @BeforeEach
    void setUp() {
        findPrimeNumber = new FindPrimeNumber();
    }

    @Test
    public void shouldValidateGivenPrimeNumber() {
        assertFalse(findPrimeNumber.isPrime(1));
        assertTrue(findPrimeNumber.isPrime(2));
        assertTrue(findPrimeNumber.isPrime(17));
        assertFalse(findPrimeNumber.isPrime(4));
        assertFalse(findPrimeNumber.isPrime(25));
        assertTrue(findPrimeNumber.isPrime(11));
    }

    @Test
    public void shouldGetAllPrimeNumbers() {
        List<Integer> list1 = findPrimeNumber.getAllPrimeNumbers(7);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7), list1);

        List<Integer> list2 = findPrimeNumber.getAllPrimeNumbers(15);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13), list2);
    }

    @Test
    public void shouldGetAllPrimeNumbersUsingSeiveAlgorithm() {
        List<Integer> list1 = findPrimeNumber.getAllPrimeNumbersUsingSeiveAlgorithm(7);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7), list1);

        List<Integer> list2 = findPrimeNumber.getAllPrimeNumbersUsingSeiveAlgorithm(15);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13), list2);
    }
}

