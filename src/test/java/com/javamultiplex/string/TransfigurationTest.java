package com.javamultiplex.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 03/02/21 10:59 pm
 * @copyright www.javamultiplex.com
 */
public class TransfigurationTest {

    @Test
    public void shouldDoTransfiguration() {
        int result = Transfiguration.transfigure("GEEKSFORGEEKS", "FORGEEKSGEEKS");
        assertEquals(3, result);
        int result1 = Transfiguration.transfigure("ABC", "BCA");
        assertEquals(2, result1);
    }
}
