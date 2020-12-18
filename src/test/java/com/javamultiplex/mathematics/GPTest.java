package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 18/12/20 10:07 pm
 * @copyright www.javamultiplex.com
 */
public class GPTest {
    @Test
    public void shouldFindNthTerm() {
        double result = GP.nthTerm(2, 3, 1);
        Assertions.assertEquals(2, result);
        double result2 = GP.nthTerm(1, 2, 2);
        Assertions.assertEquals(2, result2);
        double result3 = GP.nthTerm(84, 87, 3);
        Assertions.assertEquals(90, result3);
    }
}
