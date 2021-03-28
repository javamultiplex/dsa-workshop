package com.javamultiplex.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 28/03/21 3:06 pm
 * @copyright www.javamultiplex.com
 */
public class SubsequenceGeneratorTest {

    @Test
    public void shouldGenerateSubsequences(){
        Assertions.assertIterableEquals(Arrays.asList("","A","B","C","AB","AC","BC","ABC"),
                SubsequenceGenerator.subsequences("ABC"));
        Assertions.assertIterableEquals(Arrays.asList("","A","B","C","D","AB","AC","AD","BC","BD","CD","ABC","ABD","ACD","BCD","ABCD"),
                SubsequenceGenerator.subsequences("ABCD"));
    }
}
