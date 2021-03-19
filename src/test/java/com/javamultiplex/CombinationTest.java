package com.javamultiplex;

import com.javamultiplex.recursion.Combination;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 19/03/21 10:11 pm
 * @copyright www.javamultiplex.com
 */
public class CombinationTest {

    @Test
    public void shouldFindCombination() {
        assertEquals(78, Combination.nCr(13,11));
        assertEquals(10, Combination.nCr(5,2));
        assertEquals(4, Combination.nCr(4,1));
        assertEquals(1540, Combination.nCr(22,19));
    }
}
