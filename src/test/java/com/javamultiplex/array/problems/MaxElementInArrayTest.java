package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 12/01/21 11:07 pm
 * @copyright www.javamultiplex.com
 */
public class MaxElementInArrayTest {

    @Test
    public void shouldFindMaxElement(){
        int result = MaxElementInArray.find(new int[]{8, 2, 1, 9, -7}, 5);
        assertEquals(9, result);
        int result1 = MaxElementInArray.find(new int[]{-1, -2, -10, -9, -7}, 5);
        assertEquals(-1, result1);
    }
}
