package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 13/12/20 10:02 pm
 * @copyright www.javamultiplex.com
 */
public class GCDTest {

    @Test
    public void shouldCalculateGCD() {
        int result1 = GCD.getGCD(7, 0);
        assertEquals(7, result1);
        int result2 = GCD.getGCD(0, 8);
        assertEquals(8, result2);
        int result3 = GCD.getGCD(12, 144);
        assertEquals(12, result3);
        int result4 = GCD.getGCD(7, 6);
        assertEquals(1, result4);
        int result5 = GCD.getGCD(40, 12);
        assertEquals(4, result5);
    }
}
