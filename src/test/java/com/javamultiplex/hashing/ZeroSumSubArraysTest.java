package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 07/03/21 11:34 pm
 * @copyright www.javamultiplex.com
 */
public class ZeroSumSubArraysTest {

    @Test
    public void shouldFindZeroSumSubArrays_method1() {
        assertEquals(6,
                ZeroSumSubArrays.method1(new int[]{0, 0, 5, 5, 0, 0}, 6));

        assertEquals(4,
                ZeroSumSubArrays.method1(new int[]{6, -1, -3, 4, -2, 2, 4, 6, -12, -7}, 10));
    }
}
