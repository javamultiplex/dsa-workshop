package com.javamultiplex.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author Rohit Agarwal on 24/03/21 10:38 pm
 * @copyright www.javamultiplex.com
 */
public class NaivePatternSearchingAlgorithmTest {

    @Test
    public void shouldDoPatternSearching() {
        assertIterableEquals(Arrays.asList(0, 2), NaivePatternSearchingAlgorithm.search("ABABABCD", "ABAB"));
        assertIterableEquals(Collections.singletonList(3), NaivePatternSearchingAlgorithm.search("ABCABCD", "ABCD"));
        assertIterableEquals(Arrays.asList(0, 1, 2), NaivePatternSearchingAlgorithm.search("AAAAA", "AAA"));
    }
}
