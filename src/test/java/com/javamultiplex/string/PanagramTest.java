package com.javamultiplex.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 31/03/21 11:34 pm
 * @copyright www.javamultiplex.com
 */
public class PanagramTest {

    @Test
    public void shouldTestPanagram(){
        assertTrue(Panagram.isPanagram("Thequickbrownfoxjumpsoverthelazydog"));
        assertFalse(Panagram.isPanagram("HeavyDuty"));
    }
}
