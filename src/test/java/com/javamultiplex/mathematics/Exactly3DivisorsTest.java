package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 21/12/20 8:21 pm
 * @copyright www.javamultiplex.com
 */
public class Exactly3DivisorsTest {

    @Test
    public void shouldGetExactly3DivisorsCountUsingSimpleSeive() {
        int result1 = Exactly3Divisors.getExactly3DivisorsUsingSeiveAlgorithm(6);
        assertEquals(1, result1);
        int result2 = Exactly3Divisors.getExactly3DivisorsUsingSeiveAlgorithm(10);
        assertEquals(2, result2);
        int result3 = Exactly3Divisors.getExactly3DivisorsUsingSeiveAlgorithm(25);
        assertEquals(3, result3);
        int result4 = Exactly3Divisors.getExactly3DivisorsUsingSeiveAlgorithm(49);
        assertEquals(4, result4);
    }

    @Test
    public void shouldGetExactly3DivisorsCount() {
        int result1 = Exactly3Divisors.getExactly3Divisors(6);
        assertEquals(1, result1);
        int result2 = Exactly3Divisors.getExactly3Divisors(10);
        assertEquals(2, result2);
        int result3 = Exactly3Divisors.getExactly3Divisors(25);
        assertEquals(3, result3);
        int result4 = Exactly3Divisors.getExactly3Divisors(49);
        assertEquals(4, result4);
    }
}
