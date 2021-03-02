package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 02/03/21 11:20 pm
 * @copyright www.javamultiplex.com
 */
public class MaximumDistanceBetweenSameElementsTest {
    @Test
    public void shouldFindMaxDistance() {
        assertEquals(5, MaximumDistanceBetweenSameElements.maxDistance(new int[]{1, 1, 2, 2, 2, 1}, 6));
        assertEquals(10, MaximumDistanceBetweenSameElements.maxDistance(new int[]{3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}, 12));
    }
}
