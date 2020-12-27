package com.javamultiplex.mathematics.problems;

import com.javamultiplex.mathematics.problems.LCM;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 13/12/20 10:14 pm
 * @copyright www.javamultiplex.com
 */
public class LCMTest {
    @Test
    public void shouldCalculateLCM() {
        int result1 = LCM.getLCM(7, 0);
        assertEquals(0, result1);
        int result2 = LCM.getLCM(0, 8);
        assertEquals(0, result2);
        int result3 = LCM.getLCM(12, 144);
        assertEquals(144, result3);
        int result4 = LCM.getLCM(7, 6);
        assertEquals(42, result4);
        int result5 = LCM.getLCM(40, 12);
        assertEquals(120, result5);
    }
}
