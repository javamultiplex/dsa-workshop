package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/12/20 10:49 pm
 * @copyright www.javamultiplex.com
 */
public class MajorityTest {
    @Test
    public void shouldFindMajorityElement() {
        int result1 = Majority.method1(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5}, 11, 4, 5);
        assertEquals(4, result1);
        int result2 = Majority.method1(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8, 1, 7);
        assertEquals(1, result2);
        int result3 = Majority.method1(new int[]{40, 85, 9, 14, 53}, 5, 13, 32);
        assertEquals(13, result3);
    }
}
