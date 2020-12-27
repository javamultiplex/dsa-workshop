package com.javamultiplex.mathematics.problems;

import com.javamultiplex.mathematics.problems.NumberOfDigitsInFactorialOfNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 17/12/20 9:52 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfDigitsInFactorialOfNumberTest {

    @Test
    public void shouldFindNumberOfDigitsInFactorialByMethod1() {
        int digits1 = NumberOfDigitsInFactorialOfNumber.method1(5);
        assertEquals(3, digits1);
        int digits2 = NumberOfDigitsInFactorialOfNumber.method1(120);
        assertEquals(199, digits2);
    }

    @Test
    public void shouldFindNumberOfDigitsInFactorialByMethod2() {
        int digits1 = NumberOfDigitsInFactorialOfNumber.method2(5);
        assertEquals(3, digits1);
        int digits2 = NumberOfDigitsInFactorialOfNumber.method2(120);
        assertEquals(199, digits2);
    }
}
