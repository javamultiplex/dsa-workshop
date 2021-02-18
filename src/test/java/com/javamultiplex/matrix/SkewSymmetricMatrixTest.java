package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 18/02/21 11:45 pm
 * @copyright www.javamultiplex.com
 */
public class SkewSymmetricMatrixTest {

    @Test
    public void shouldTestSkewSymmetricMatrix() {
        assertFalse(SkewSymmetricMatrix.isSkewSymmetricMatrix(new int[][]
                {
                        {1, 1},
                        {1, 2},
                        {-1, 0}

                }));

        assertFalse(SkewSymmetricMatrix.isSkewSymmetricMatrix(new int[][]
                {
                        {1, 1, 8},
                        {1, 2, 9},
                        {-1, 0, 1}

                }));
        assertTrue(SkewSymmetricMatrix.isSkewSymmetricMatrix(new int[][]
                {
                        {0, 1, -2},
                        {-1, 0, 3},
                        {2, -3, 0}

                }));
        assertTrue(SkewSymmetricMatrix.isSkewSymmetricMatrix(new int[][]
                {
                        {0, 2, -7},
                        {-2, 0, 3},
                        {7, -3, 0}

                }));
        assertTrue(SkewSymmetricMatrix.isSkewSymmetricMatrix(new int[][]
                {
                        {0, -5},
                        {5, 0}

                }));
    }
}
