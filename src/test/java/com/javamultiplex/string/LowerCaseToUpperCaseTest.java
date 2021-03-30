package com.javamultiplex.string;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 30/03/21 11:25 pm
 * @copyright www.javamultiplex.com
 */
public class LowerCaseToUpperCaseTest {

    @Test
    public void shouldConvertToUpperCase(){
        assertEquals("FOR",LowerCaseToUpperCase.toUpperCase("for"));
        assertEquals("ROHIT",LowerCaseToUpperCase.toUpperCase("rohit"));
    }
}
