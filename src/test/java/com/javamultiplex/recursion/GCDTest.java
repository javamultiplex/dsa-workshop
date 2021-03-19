package com.javamultiplex.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 20/03/21 12:20 am
 * @copyright www.javamultiplex.com
 */
public class GCDTest {
    @Test
    public void shouldFindGCD(){
        assertEquals(1, GCD.GCD(7,8));
        assertEquals(2, GCD.GCD(2,4));
    }
}
