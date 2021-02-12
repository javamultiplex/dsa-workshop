package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 12/02/21 11:04 pm
 * @copyright www.javamultiplex.com
 */
public class UnionOfTwoSortedArrayTest {

    @Test
    public void shouldFindUnion() {
        ArrayList<Integer> union = UnionOfTwoSortedArray.findUnion(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3}, 5, 3);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5).toString(), union.toString());

        ArrayList<Integer> union1 = UnionOfTwoSortedArray.findUnion(new int[]{2, 2, 3, 4, 5}, new int[]{1, 1, 2, 3, 4}, 5, 5);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5).toString(), union1.toString());

        ArrayList<Integer> union2 = UnionOfTwoSortedArray.findUnion(new int[]{1, 1, 1, 1, 1}, new int[]{2, 2, 2, 2, 2}, 5, 5);
        assertEquals(Arrays.asList(1, 2).toString(), union2.toString());
    }
}
