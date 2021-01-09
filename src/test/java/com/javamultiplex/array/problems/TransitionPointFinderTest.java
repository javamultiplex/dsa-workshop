package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 09/01/21 10:33 pm
 * @copyright www.javamultiplex.com
 */
public class TransitionPointFinderTest {
    @Test
    public void shouldFindTransitionPoint() {
        int transitionPoint = TransitionPointFinder.transitionPoint(new int[]{0, 0, 0, 1, 1}, 5);
        assertEquals(3, transitionPoint);
        int transitionPoint1 = TransitionPointFinder.transitionPoint(new int[]{0, 0, 0, 0, 0}, 5);
        assertEquals(-1, transitionPoint1);
        int transitionPoint2 = TransitionPointFinder.transitionPoint(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 49);
        assertEquals(19, transitionPoint2);
    }
}
