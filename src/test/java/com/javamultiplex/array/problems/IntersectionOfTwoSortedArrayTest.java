package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 12/02/21 11:20 pm
 * @copyright www.javamultiplex.com
 */
public class IntersectionOfTwoSortedArrayTest {

    @Test
    public void shouldFindIntersection() {
        ArrayList<Integer> intersection = IntersectionOfTwoSortedArray.findIntersection(new int[]{1, 2, 3, 4}, new int[]{2, 4, 6, 7, 8}, 4, 5);
        assertEquals(Arrays.asList(2, 4).toString(), intersection.toString());

        ArrayList<Integer> intersection1 = IntersectionOfTwoSortedArray.findIntersection(new int[]{1, 2, 2, 3, 4}, new int[]{2, 2, 4, 6, 7, 8}, 5, 6);
        assertEquals(Arrays.asList(2, 4).toString(), intersection1.toString());

        ArrayList<Integer> intersection2 = IntersectionOfTwoSortedArray.findIntersection(new int[]{1, 2}, new int[]{3, 4}, 2, 2);
        assertEquals(Collections.emptyList().toString(), intersection2.toString());
    }
}
