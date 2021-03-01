package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 01/03/21 11:49 pm
 * @copyright www.javamultiplex.com
 */
public class SearchElementInRowWiseAndColumnWiseSortedMatrixTest {
    @Test
    public void shouldSearch() {
        assertFalse(SearchElementInRowWiseAndColumnWiseSortedMatrix.search(new int[][]{
                {3, 30, 38},
                {36, 43, 60},
                {40, 51, 69}}, 62));

        assertTrue(SearchElementInRowWiseAndColumnWiseSortedMatrix.search(new int[][]{
                {18, 21, 27, 38, 55, 67}}, 55));
    }
}
