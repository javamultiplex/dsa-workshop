package com.javamultiplex.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 30/03/21 11:49 pm
 * @copyright www.javamultiplex.com
 */
public class StringValidationTest {

    @Test
    public void shouldValidateString() {
        assertTrue(StringValidation.validate("eHello123@"));
        assertFalse(StringValidation.validate("hella"));
    }
}
