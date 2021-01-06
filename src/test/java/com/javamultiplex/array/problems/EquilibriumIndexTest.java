package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 04/01/21 11:09 pm
 * @copyright www.javamultiplex.com
 */
public class EquilibriumIndexTest {

    @Test
    public void shouldGetEquilibriumIndex_method1() {
        int index = EquilibriumIndex.method1(new int[]{-7, 1, 5, 2, -4, 3, 0}, 7);
        assertEquals(3, index);
    }

    @Test
    public void shouldGetEquilibriumIndex_method2() {
        int index = EquilibriumIndex.method2(new int[]{-7, 1, 5, 2, -4, 3, 0}, 7);
        assertEquals(3, index);
    }
}
