package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 18/02/21 10:34 pm
 * @copyright www.javamultiplex.com
 */
public class SquareMatrixTest {

    @Test
    public void shouldTestSquareMatrix() {
        assertTrue(SquareMatrix.isSquareMatrix(new int[][]
                {
                        {1, 2},
                        {4, 5}
                }));
        assertFalse(SquareMatrix.isSquareMatrix(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 9}
                }));

        assertTrue(SquareMatrix.isSquareMatrix(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }));
        assertFalse(SquareMatrix.isSquareMatrix(new int[][]
                {
                        {1, 2},
                        {4, 5},
                        {7, 8}
                }));
    }

}
