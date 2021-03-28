package com.javamultiplex.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 28/03/21 3:15 pm
 * @copyright www.javamultiplex.com
 */
public class SubsequenceValidatorTest {

    @Test
    public void shouldValidateSubsequence(){
        Assertions.assertTrue(SubsequenceValidator.validateSubsequence("ABCD","ACD"));
        Assertions.assertFalse(SubsequenceValidator.validateSubsequence("ABCD","ACB"));
    }
}
