package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 17/12/20 9:52 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfDigitsInFactorialOfNumberTest {

    @Test
    public void shouldFindNumberOfDigitsInFactorial() {
        int digits1 = NumberOfDigitsInFactorialOfNumber.digitsInFactorial(5);
        assertEquals(3, digits1);
        int digits2 = NumberOfDigitsInFactorialOfNumber.digitsInFactorial(120);
        assertEquals(199, digits2);
    }
}
