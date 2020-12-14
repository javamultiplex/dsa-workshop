package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 14/12/20 9:01 pm
 * @copyright www.javamultiplex.com
 */
public class FactorialTest {

    @Test
    public void shouldCalculateFactorial() {
        BigInteger result1 = Factorial.fact(0);
        Assertions.assertEquals(BigInteger.ONE, result1);
        BigInteger result2 = Factorial.fact(4);
        Assertions.assertEquals(BigInteger.valueOf(24), result2);
        BigInteger result3 = Factorial.fact(5);
        Assertions.assertEquals(BigInteger.valueOf(120), result3);
        BigInteger result4 = Factorial.fact(10);
        Assertions.assertEquals(BigInteger.valueOf(3628800), result4);
    }
}
