package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 10/01/21 11:18 am
 * @copyright www.javamultiplex.com
 */
public class FirstRepeatingElementTest {

    @Test
    public void shouldFindFirstRepeatingElement() {
        int result = FirstRepeatingElement.firstRepeated(new int[]{1, 5, 3, 4, 3, 5, 6}, 7);
        assertEquals(2, result);

        int result1 = FirstRepeatingElement.firstRepeated(new int[]{1, 2, 3, 4}, 4);
        assertEquals(-1, result1);

        int result2 = FirstRepeatingElement.firstRepeated(new int[]{1, 4, 2, 3, 5, 4}, 6);
        assertEquals(2, result2);
    }
}
