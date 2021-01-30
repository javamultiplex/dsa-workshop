package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 29/01/21 11:38 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfMinimumPicksToGetKPairsOfSocksTest {

    @Test
    public void shouldDoMinimumPicks() {
        int result = NumberOfMinimumPicksToGetKPairsOfSocks.method1(new int[]{3, 4, 5, 3}, 4, 6);
        assertEquals(15, result);
        int result1 = NumberOfMinimumPicksToGetKPairsOfSocks.method1(new int[]{4, 6}, 2, 3);
        assertEquals(7, result1);
        int result2 = NumberOfMinimumPicksToGetKPairsOfSocks.method1(new int[]{4, 5, 7, 8, 2}, 5, 8);
        assertEquals(20, result2);
    }
}
