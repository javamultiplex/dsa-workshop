package com.javamultiplex.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 31/03/21 11:43 pm
 * @copyright www.javamultiplex.com
 */
public class MissingCharacterInPanagramTest {

    @Test
    public void shouldFindMissingCharacterInPanagram() {
        assertEquals("z", MissingCharacterInPanagram.find("Abcdefghijklmnopqrstuvwxy"));
        assertEquals("defghijklmnopqrstuvwxyz", MissingCharacterInPanagram.find("Abc"));
        assertEquals("-1",MissingCharacterInPanagram.find("Thequickbrownfoxjumpsoverthelazydog"));
    }
}
