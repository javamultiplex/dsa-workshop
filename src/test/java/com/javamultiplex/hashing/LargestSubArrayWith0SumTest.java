package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 07/03/21 11:07 pm
 * @copyright www.javamultiplex.com
 */
public class LargestSubArrayWith0SumTest {

    @Test
    public void shouldFindLargestSubArrayWith0Sum() {
        assertEquals(5,
                LargestSubArrayWith0Sum.maxLen(new int[]{15, -2, 2, -8, 1, 7, 10, 23}, 8));
    }
}
