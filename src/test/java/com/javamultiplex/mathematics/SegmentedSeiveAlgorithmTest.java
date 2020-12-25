package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 25/12/20 7:52 pm
 * @copyright www.javamultiplex.com
 */
public class SegmentedSeiveAlgorithmTest {
    @Test
    public void shouldGetPrimeNumbersInRange() {
        List<Integer> result1 = SegmentedSeiveAlgorithm.primes(2, 10);
        assertEquals(Arrays.asList(2, 3, 5, 7), result1);

        List<Integer> result2 = SegmentedSeiveAlgorithm.primes(10, 20);
        assertEquals(Arrays.asList(11, 13, 17, 19), result2);
    }
}
