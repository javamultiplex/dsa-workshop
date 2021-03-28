package com.javamultiplex.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 24/03/21 11:30 pm
 * @copyright www.javamultiplex.com
 */
public class CountDistinctVowelsTest {
    @Test
    public void shouldCountDistinctVowels(){
        Assertions.assertEquals(1,CountDistinctVowels.countVowels("geeks"));
        Assertions.assertEquals(1,CountDistinctVowels.countVowels("world"));
    }
}
