package com.javamultiplex.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 03/04/21 2:12 pm
 * @copyright www.javamultiplex.com
 */
public class PowerTest {

    @Test
    public void shouldCalculatePower() {
        assertEquals(1, Power.power(3, 0));
        assertEquals(3, Power.power(3, 1));
        assertEquals(64, Power.power(4, 3));
    }
}
