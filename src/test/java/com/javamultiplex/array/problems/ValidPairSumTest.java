package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 01/02/21 8:36 pm
 * @copyright www.javamultiplex.com
 */
public class ValidPairSumTest {

    @Test
    public void shouldFindValidPair_method1() {
        long result = ValidPairSum.method1(new int[]{3, -2, 1}, 3);
        assertEquals(2, result);
        long result1 = ValidPairSum.method1(new int[]{-1, -1, -1, 0}, 4);
        assertEquals(0, result1);
    }

    @Test
    public void shouldFindValidPair_method2() {
        long result = ValidPairSum.method2(new int[]{3, -2, 1}, 3);
        assertEquals(2, result);
        long result1 = ValidPairSum.method2(new int[]{-1, -1, -1, 0}, 4);
        assertEquals(0, result1);
    }
}
