package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author Rohit Agarwal on 03/03/21 11:30 pm
 * @copyright www.javamultiplex.com
 */
public class NonRepeatedElementsTest {

    @Test
    public void shouldFindNonRepeatedElements() {
        assertIterableEquals(Arrays.asList(4, 5, 6, 7),
                NonRepeatedElements.printNonRepeated(new int[]{1, 1, 2, 2, 3, 3, 4, 5, 6, 7}, 10));
        assertIterableEquals(Arrays.asList(20, 40, 30),
                NonRepeatedElements.printNonRepeated(new int[]{10, 20, 40, 30, 10}, 5));
    }
}
