package com.javamultiplex.array.algorithms;

import com.javamultiplex.array.problems.LargestSumSubArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 09/01/21 10:47 am
 * @copyright www.javamultiplex.com
 */
public class KadaneAlgorithmTest {

    @Test
    public void shouldGetLargestSum() {
        int result = KadaneAlgorithm.getLargestSumSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}, 8);
        assertEquals(7, result);
        int result2 = KadaneAlgorithm.getLargestSumSubArray(new int[]{1, 5, -4, -3, 8, 3}, 6);
        assertEquals(11, result2);
        int result3 = KadaneAlgorithm.getLargestSumSubArray(new int[]{-3, 4, -1, -2, 1, 5}, 6);
        assertEquals(7, result3);
    }
}
