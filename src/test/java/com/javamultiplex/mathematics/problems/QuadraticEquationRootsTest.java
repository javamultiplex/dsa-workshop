package com.javamultiplex.mathematics.problems;

import com.javamultiplex.mathematics.problems.QuadraticEquationRoots;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 17/12/20 9:33 pm
 * @copyright www.javamultiplex.com
 */
public class QuadraticEquationRootsTest {

    @Test
    public void shouldFindRoots() {
        ArrayList<Integer> roots1 = QuadraticEquationRoots.quadraticRoots(1, -7, 12);
        assertEquals(Arrays.asList(4, 3), roots1);

        ArrayList<Integer> roots2 = QuadraticEquationRoots.quadraticRoots(752, 904, 164);
        assertEquals(Arrays.asList(-1, -1), roots2);

        ArrayList<Integer> roots3 = QuadraticEquationRoots.quadraticRoots(1, -2, 1);
        assertEquals(Arrays.asList(1, 1), roots3);

        ArrayList<Integer> roots4 = QuadraticEquationRoots.quadraticRoots(280, 399, 573);
        assertEquals(Collections.singletonList(-1), roots4);
    }
}
