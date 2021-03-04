package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author Rohit Agarwal on 04/03/21 10:46 pm
 * @copyright www.javamultiplex.com
 */
public class SortByFrequencyTest {

    @Test
    public void shouldSortByFrequency() {
        assertIterableEquals(Arrays.asList(4, 4, 5, 5, 6),
                SortByFrequency.sortByFreq(new int[]{5, 5, 4, 6, 4}, 5));
        assertIterableEquals(Arrays.asList(9, 9, 9, 2, 5),
                SortByFrequency.sortByFreq(new int[]{9, 9, 9, 2, 5}, 5));
    }
}
