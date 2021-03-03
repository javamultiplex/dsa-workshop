package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 03/03/21 11:17 pm
 * @copyright www.javamultiplex.com
 */
public class TwoSumTest {

    @Test
    public void shouldTestTwoSum() {
        assertTrue(TwoSum.keypair(new int[]{1, 4, 45, 6, 10, 8}, 6, 16));
        assertTrue(TwoSum.keypair(new int[]{1, 2, 4, 3, 6}, 5, 10));
    }
}
