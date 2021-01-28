package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 28/01/21 10:56 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestPositiveTest {

    @Test
    public void shouldFindSmallestPositive_method1() {
        long result = SmallestPositive.method1(new long[]{1, 1, 1}, 3);
        assertEquals(4, result);
        long result1 = SmallestPositive.method1(new long[]{1, 10, 3, 11, 6, 15}, 6);
        assertEquals(2, result1);
        long result2 = SmallestPositive.method1(new long[]{1, 3, 4, 5}, 4);
        assertEquals(2, result2);
        long result3 = SmallestPositive.method1(new long[]{1, 2, 6, 10, 11, 15}, 6);
        assertEquals(4, result3);
        long result4 = SmallestPositive.method1(new long[]{1, 1, 3, 4}, 4);
        assertEquals(10, result4);
    }
}
