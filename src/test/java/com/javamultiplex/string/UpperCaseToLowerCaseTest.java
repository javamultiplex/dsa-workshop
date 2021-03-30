package com.javamultiplex.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 30/03/21 11:31 pm
 * @copyright www.javamultiplex.com
 */
public class UpperCaseToLowerCaseTest {

    @Test
    public void shouldConvertUpperCaseToLowerCase() {
        assertEquals("rohit", UpperCaseToLowerCase.toLowerCase("ROHIT"));
        assertEquals("for", UpperCaseToLowerCase.toLowerCase("FOR"));
    }
}
