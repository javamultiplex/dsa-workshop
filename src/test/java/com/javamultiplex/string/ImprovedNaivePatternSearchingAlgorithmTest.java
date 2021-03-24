package com.javamultiplex.string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author Rohit Agarwal on 24/03/21 11:09 pm
 * @copyright www.javamultiplex.com
 */
public class ImprovedNaivePatternSearchingAlgorithmTest {

    @Test
    public void shouldDoPatternSearching() {
        assertIterableEquals(Arrays.asList(3, 7), ImprovedNaivePatternSearchingAlgorithm.search("ABCABCDABCD", "ABCD"));
        assertIterableEquals(Arrays.asList(2,10), ImprovedNaivePatternSearchingAlgorithm.search("GEEKSFORGEEKS", "EKS"));
        assertIterableEquals(new ArrayList<>(), ImprovedNaivePatternSearchingAlgorithm.search("ABCAAAD", "ABD"));
    }
}
