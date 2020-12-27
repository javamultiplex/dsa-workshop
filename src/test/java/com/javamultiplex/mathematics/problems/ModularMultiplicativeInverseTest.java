package com.javamultiplex.mathematics.problems;

import com.javamultiplex.mathematics.problems.ModularMultiplicativeInverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 22/12/20 10:49 pm
 * @copyright www.javamultiplex.com
 */
public class ModularMultiplicativeInverseTest {

    @Test
    public void shouldGetModularMultiplicativeInverseByExtendedEuclideanAlgo() {
        int result1 = ModularMultiplicativeInverse.modInverseByExtendedEuclideanAlgo(10, 17);
        assertEquals(12, result1);
        int result2 = ModularMultiplicativeInverse.modInverseByExtendedEuclideanAlgo(3, 11);
        assertEquals(4, result2);
        int result3 = ModularMultiplicativeInverse.modInverseByExtendedEuclideanAlgo(12, 144);
        assertEquals(-1, result3);
    }

    @Test
    public void shouldGetModularMultiplicativeInverseByBruteForceAlgo() {
        int result1 = ModularMultiplicativeInverse.modInverseByBruteForce(10, 17);
        assertEquals(12, result1);
        int result2 = ModularMultiplicativeInverse.modInverseByBruteForce(3, 11);
        assertEquals(4, result2);
        int result3 = ModularMultiplicativeInverse.modInverseByBruteForce(12, 144);
        assertEquals(-1, result3);
        int result4 = ModularMultiplicativeInverse.modInverseByBruteForce(2, 1);
        assertEquals(-1, result4);
    }
}
