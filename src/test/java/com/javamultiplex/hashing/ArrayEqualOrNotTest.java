package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 02/03/21 11:00 pm
 * @copyright www.javamultiplex.com
 */
public class ArrayEqualOrNotTest {

    @Test
    public void shouldCompareTwoArrays() {
        assertTrue(ArrayEqualOrNot.check(new int[]{1, 2, 5, 4, 0}, new int[]{2, 4, 5, 0, 1}, 5));
        assertFalse(ArrayEqualOrNot.check(new int[]{1, 2, 5}, new int[]{2, 4, 15}, 3));
    }
}
