package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 04/01/21 10:38 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayRangeSumTest {

    @Test
    public void shouldGetSumInRange() {
        int sum1 = ArrayRangeSum.get(new int[]{10, 20, 10, 5, 15}, 5, 0, 3);
        assertEquals(45, sum1);
        int sum2 = ArrayRangeSum.get(new int[]{10, 20, 10, 5, 15}, 5, 2, 3);
        assertEquals(15, sum2);
        int sum3 = ArrayRangeSum.get(new int[]{10, 20, 10, 5, 15}, 5, 1, 4);
        assertEquals(50, sum3);
        int sum4 = ArrayRangeSum.get(new int[]{10, 20, 10, 5, 15}, 5, 1, 6);
        assertEquals(-1, sum4);
        int sum5 = ArrayRangeSum.get(new int[]{10, 20, 10, 5, 15}, 5, -1, 6);
        assertEquals(-1, sum5);
    }
}
