package com.javamultiplex.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 28/03/21 3:15 pm
 * @copyright www.javamultiplex.com
 */
public class SubsequenceValidatorTest {

    @Test
    public void shouldValidateSubsequence_method1(){
        assertTrue(SubsequenceValidator.method1("ABCD","ACD"));
        assertFalse(SubsequenceValidator.method1("ABCD","ACB"));
        assertTrue(SubsequenceValidator.method1("GEEKSFORGEEKS","GRGES"));
    }

    @Test
    public void shouldValidateSubsequence_method2(){
        assertTrue(SubsequenceValidator.method2Iterative("ABCD","ACD"));
        assertFalse(SubsequenceValidator.method2Iterative("ABCD","ACB"));
        assertTrue(SubsequenceValidator.method2Iterative("GEEKSFORGEEKS","GRGES"));
    }
}
