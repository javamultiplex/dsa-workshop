package com.javamultiplex.hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 04/03/21 12:14 am
 * @copyright www.javamultiplex.com
 */
public class TopKFrequentElementsTest {

    @Test
    public void shouldFindTopKElements() {
        Assertions.assertArrayEquals(new int[]{1, 2},
                TopKFrequentElements.topK(new int[]{1, 1, 1, 2, 2, 3}, 2));
        Assertions.assertArrayEquals(new int[]{3, 2},
                TopKFrequentElements.topK(new int[]{1, 1, 2, 2, 3, 3, 3, 4}, 2));
    }
}
