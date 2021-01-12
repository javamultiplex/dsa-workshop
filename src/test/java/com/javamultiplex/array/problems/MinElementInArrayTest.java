package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 12/01/21 11:07 pm
 * @copyright www.javamultiplex.com
 */
public class MinElementInArrayTest {

    @Test
    public void shouldFindMinElement(){
        int result = MinElementInArray.find(new int[]{8, 2, 1, 9, -7}, 5);
        assertEquals(-7, result);
        int result1 = MinElementInArray.find(new int[]{-1, -2, -10, -9, -7}, 5);
        assertEquals(-10, result1);
    }
}
