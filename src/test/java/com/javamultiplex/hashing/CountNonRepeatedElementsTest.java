package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 05/03/21 6:49 pm
 * @copyright www.javamultiplex.com
 */
public class CountNonRepeatedElementsTest {

    @Test
    public void shouldCountNonRepeatedElements() {
        assertEquals(4,
                CountNonRepeatedElements.countNonRepeated(new int[]{1, 1, 2, 2, 3, 3, 4, 5, 6, 7}, 10));

        assertEquals(3,
                CountNonRepeatedElements.countNonRepeated(new int[]{10, 20, 30, 40, 10}, 5));
    }
}
