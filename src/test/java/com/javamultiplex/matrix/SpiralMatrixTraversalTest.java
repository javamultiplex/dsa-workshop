package com.javamultiplex.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 30/01/21 4:05 pm
 * @copyright www.javamultiplex.com
 */
public class SpiralMatrixTraversalTest {

    @Test
    public void shouldTraverseSpiralMatrix() {
        List<Integer> list = SpiralMatrixTraversal.traverse(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                });
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10).toString(), list.toString());
    }

    @Test
    public void shouldGetKthElementInSpiralMatrix() {
        int result = SpiralMatrixTraversal.findK(new int[][]
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                }, 4, 4, 6);
        Assertions.assertEquals(12, result);
    }
}
