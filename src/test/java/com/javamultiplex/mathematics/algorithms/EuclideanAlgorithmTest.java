package com.javamultiplex.mathematics.algorithms;

import com.javamultiplex.mathematics.problems.GCD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/12/20 1:55 pm
 * @copyright www.javamultiplex.com
 */
public class EuclideanAlgorithmTest {
    @Test
    public void shouldCalculateGCD() {
        long result1 = EuclideanAlgorithm.gcd(7, 0);
        assertEquals(7, result1);
        long result2 = EuclideanAlgorithm.gcd(0, 8);
        assertEquals(8, result2);
        long result3 = EuclideanAlgorithm.gcd(12, 144);
        assertEquals(12, result3);
        long result4 = EuclideanAlgorithm.gcd(7, 6);
        assertEquals(1, result4);
        long result5 = EuclideanAlgorithm.gcd(40, 12);
        assertEquals(4, result5);
        long result6 = EuclideanAlgorithm.gcd(2, 1);
        assertEquals(1, result6);
    }
}
