package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 05/03/21 11:54 pm
 * @copyright www.javamultiplex.com
 */
public class WinnerOfAnElectionTest {

    @Test
    public void shouldFindWinner() {
        assertArrayEquals(new String[]{"john", "4"},
                WinnerOfAnElection.winner(new String[]{"john", "johnny", "jackie", "johnny", "john",
                        "jackie", "jamie", "jamie", "john", "johnny", "jamie",
                        "johnny", "john"}, 13));

        assertArrayEquals(new String[]{"andy", "1"},
                WinnerOfAnElection.winner(new String[]{
                        "andy", "blake", "clark"
                }, 3));
    }
}
