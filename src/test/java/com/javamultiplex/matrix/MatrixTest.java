package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 20/02/21 9:10 pm
 * @copyright www.javamultiplex.com
 */
public class MatrixTest {

    @Test
    public void shouldFindMatrixTranspose() {
        assertArrayEquals(new int[][]
                {
                        {1, 4},
                        {2, 5},
                        {3, 9}
                }, Matrix.transpose(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 9}
                }));

        assertArrayEquals(new int[][]
                {
                        {1, 4, 8},
                        {2, 5, 10},
                        {3, 9, 11}
                }, Matrix.transpose(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 9},
                        {8, 10, 11}
                }));

        assertArrayEquals(new int[][]
                {
                        {1, 4, 8},
                        {2, 5, 10}
                }, Matrix.transpose(new int[][]
                {
                        {1, 2},
                        {4, 5},
                        {8, 10}
                }));
    }

    @Test
    public void shouldTestSquareMatrix() {
        assertTrue(Matrix.isSquareMatrix(new int[][]
                {
                        {1, 2},
                        {4, 5}
                }));
        assertFalse(Matrix.isSquareMatrix(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 9}
                }));

        assertTrue(Matrix.isSquareMatrix(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }));
        assertFalse(Matrix.isSquareMatrix(new int[][]
                {
                        {1, 2},
                        {4, 5},
                        {7, 8}
                }));
    }

    @Test
    public void shouldTestSymmetricMatrix() {
        assertFalse(Matrix.isSymmetricMatrix(new int[][]
                {
                        {1, 1},
                        {1, 2},
                        {-1, 0}

                }));

        assertFalse(Matrix.isSymmetricMatrix(new int[][]
                {
                        {1, 1, 8},
                        {1, 2, 9},
                        {-1, 0, 1}

                }));
        assertTrue(Matrix.isSymmetricMatrix(new int[][]
                {
                        {1, 1, -1},
                        {1, 2, 0},
                        {-1, 0, 5}

                }));
        assertTrue(Matrix.isSymmetricMatrix(new int[][]
                {
                        {1, 2, 17},
                        {2, 5, -11},
                        {17, -11, 9}

                }));
    }

    @Test
    public void shouldTestSkewSymmetricMatrix() {
        assertFalse(Matrix.isSkewSymmetricMatrix(new int[][]
                {
                        {1, 1},
                        {1, 2},
                        {-1, 0}

                }));

        assertFalse(Matrix.isSkewSymmetricMatrix(new int[][]
                {
                        {1, 1, 8},
                        {1, 2, 9},
                        {-1, 0, 1}

                }));
        assertTrue(Matrix.isSkewSymmetricMatrix(new int[][]
                {
                        {0, 1, -2},
                        {-1, 0, 3},
                        {2, -3, 0}

                }));
        assertTrue(Matrix.isSkewSymmetricMatrix(new int[][]
                {
                        {0, 2, -7},
                        {-2, 0, 3},
                        {7, -3, 0}

                }));
        assertTrue(Matrix.isSkewSymmetricMatrix(new int[][]
                {
                        {0, -5},
                        {5, 0}

                }));
    }

    @Test
    public void shouldTestDiagonalMatrix() {
        assertTrue(Matrix.isDiagonalMatrix(new int[][]{
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        }));

        assertFalse(Matrix.isDiagonalMatrix(new int[][]{
                {1, 0, 1},
                {0, 1, 1},
                {0, 0, 1}
        }));

        assertTrue(Matrix.isDiagonalMatrix(new int[][]{
                {2, 0},
                {0, 4}
        }));
    }

    @Test
    public void shouldTestIdentityMatrix() {
        assertFalse(Matrix.isIdentityMatrix(new int[][]{
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        }));

        assertFalse(Matrix.isIdentityMatrix(new int[][]{
                {1, 0, 1},
                {0, 1, 1},
                {0, 0, 1}
        }));

        assertFalse(Matrix.isIdentityMatrix(new int[][]{
                {2, 0},
                {0, 4}
        }));

        assertFalse(Matrix.isIdentityMatrix(new int[][]{
                {1, 0},
                {0, 1}
        }));

        assertFalse(Matrix.isIdentityMatrix(new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        }));
    }

    @Test
    public void shouldTestTwoMatrices() {
        assertArrayEquals(new int[][]{
                {2, 8, 10},
                {12, 6, 9}
        }, Matrix.addition(new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        }, new int[][]{
                {1, 6, 7},
                {8, 1, 3}
        }));

        assertArrayEquals(new int[][]{
                {2, 8},
                {12, 6}
        }, Matrix.addition(new int[][]{
                {1, 2},
                {4, 5}
        }, new int[][]{
                {1, 6},
                {8, 1}
        }));

        assertThrows(RuntimeException.class, () ->
                Matrix.addition(new int[][]{
                        {1, 2},
                        {4, 5}
                }, new int[][]{
                        {1, 6, 7},
                        {8, 1, 3}
                }),"Matrix addition is not possible because for addition, number of row and columns in both matrices should be same."
        );


    }
}
