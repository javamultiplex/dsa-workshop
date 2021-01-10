package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 10/01/21 7:38 pm
 * @copyright www.javamultiplex.com
 */
public class ImmediateSmallerTest {

    @Test
    public void shouldFindImmediateSmaller() {
        int result = ImmediateSmaller.immediateSmaller(new int[]{4, 67, 13, 12, 15}, 5, 16);
        assertEquals(15, result);

        int result1 = ImmediateSmaller.immediateSmaller(new int[]{1, 2, 3, 4, 5}, 5, 1);
        assertEquals(-1, result1);
    }
}
