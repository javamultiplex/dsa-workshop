package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 31/01/21 10:53 pm
 * @copyright www.javamultiplex.com
 */
public class CoinsOfGeeklandTest {

    @Test
    public void shouldGetMaxSum() {
        int maximumSum = CoinsOfGeekland.maximumSum(new int[][]{{1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 8, 6, 7, 3},
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5}}, 5, 3);
        assertEquals(48, maximumSum);
    }
}
