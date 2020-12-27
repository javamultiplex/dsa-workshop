package com.javamultiplex.mathematics.algorithms;

import com.javamultiplex.mathematics.problems.GCD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/12/20 1:57 pm
 * @copyright www.javamultiplex.com
 */
public class ExtendedEuclideanAlgorithmTest {

    @Test
    public void shouldCalculateGCDAndCoefficients() {
        int[] c1 = {1, 1};
        int result1 = ExtendedEuclideanAlgorithm.gcd(56, 15, c1);
        assertEquals(1, result1);
        assertArrayEquals(new int[]{-4, 15}, c1);

        int[] c2 = {1, 1};
        int result2 = ExtendedEuclideanAlgorithm.gcd(3, 11, c2);
        assertEquals(1, result2);
        assertArrayEquals(new int[]{4, -1}, c2);

        int[] c3 = {1, 1};
        int result3 = ExtendedEuclideanAlgorithm.gcd(10, 17, c3);
        assertEquals(1, result3);
        assertArrayEquals(new int[]{-5, 3}, c3);
    }
}
