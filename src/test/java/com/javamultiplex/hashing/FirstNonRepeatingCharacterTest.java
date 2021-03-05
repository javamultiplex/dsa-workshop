package com.javamultiplex.hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 05/03/21 11:36 pm
 * @copyright www.javamultiplex.com
 */
public class FirstNonRepeatingCharacterTest {

    @Test
    public void shouldFindFirstNonRepeatingCharacter() {
        assertEquals('h',
                FirstNonRepeatingCharacter.nonRepeatingCharacter("hello"));
        assertEquals('c',
                FirstNonRepeatingCharacter.nonRepeatingCharacter("zxvczbtxyzvy"));
    }
}
