package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 13/12/20 10:02 pm
 * @copyright www.javamultiplex.com
 */
public class GCDTest {

    @Test
    public void shouldCalculateGCD() {
        int result1 = GCD.gcd(7, 0);
        assertEquals(7, result1);
        int result2 = GCD.gcd(0, 8);
        assertEquals(8, result2);
        int result3 = GCD.gcd(12, 144);
        assertEquals(12, result3);
        int result4 = GCD.gcd(7, 6);
        assertEquals(1, result4);
        int result5 = GCD.gcd(40, 12);
        assertEquals(4, result5);
        int result6 = GCD.gcd(2, 1);
        assertEquals(1, result6);
    }

    @Test
    public void shouldCalculateGCDAndCoefficients() {
        int[] c1 = {1, 1};
        int result1 = GCD.gcdExtended(56, 15, c1);
        assertEquals(1, result1);
        assertArrayEquals(new int[]{-4, 15}, c1);

        int[] c2 = {1, 1};
        int result2 = GCD.gcdExtended(3, 11, c2);
        assertEquals(1, result2);
        assertArrayEquals(new int[]{4, -1}, c2);

        int[] c3 = {1, 1};
        int result3 = GCD.gcdExtended(10, 17, c3);
        assertEquals(1, result3);
        assertArrayEquals(new int[]{-5, 3}, c3);
    }
}
