package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 25/12/20 7:22 pm
 * @copyright www.javamultiplex.com
 */
public class SeiveAlgorithmTest {

    @Test
    public void shouldGetAllPrimeNumbers() {
        List<Integer> list1 = SeiveAlgorithm.getAllPrimeNumbers(7);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7), list1);

        List<Integer> list2 = SeiveAlgorithm.getAllPrimeNumbers(15);
        Assertions.assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13), list2);
    }
}
