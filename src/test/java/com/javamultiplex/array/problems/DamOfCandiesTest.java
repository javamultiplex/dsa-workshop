package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 02/02/21 10:11 pm
 * @copyright www.javamultiplex.com
 */
public class DamOfCandiesTest {

    @Test
    public void shouldTestMethod1() {
        int result = DamOfCandies.method1(new int[]{1, 3, 4}, 3);
        assertEquals(1, result);
        int result1 = DamOfCandies.method1(new int[]{2, 1, 3, 4, 6, 5}, 6);
        assertEquals(8, result1);
    }
}
