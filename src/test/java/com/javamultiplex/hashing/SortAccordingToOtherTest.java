package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 04/03/21 11:35 pm
 * @copyright www.javamultiplex.com
 */
public class SortAccordingToOtherTest {

    @Test
    public void shouldSortAccordingToOther() {
        assertArrayEquals(new int[]{2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9},
                SortAccordingToOther.sortA1ByA2(new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8},
                        11,
                        new int[]{2, 1, 8, 3},
                        4));

        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 5, 6, 7, 8, 8, 9},
                SortAccordingToOther.sortA1ByA2(new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8},
                        11,
                        new int[]{99, 22, 444, 56},
                        4));
    }
}
