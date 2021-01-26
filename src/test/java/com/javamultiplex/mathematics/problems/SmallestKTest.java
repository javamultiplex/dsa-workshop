package com.javamultiplex.mathematics.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 26/01/21 12:18 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestKTest {

    @Test
    public void shouldFindSmallestK() {
        long result = SmallestK.smallestK(5);
        Assertions.assertEquals(5, result);

        long result1 = SmallestK.smallestK(12);
        Assertions.assertEquals(26, result1);
    }
}
