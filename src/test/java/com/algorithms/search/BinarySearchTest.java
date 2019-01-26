package com.algorithms.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private static final char A = 'A';

    private static final char B = 'B';

    private static final char C = 'C';

    private static final char D = 'D';

    private static final char E = 'E';

    private BinarySearch subject;

    @BeforeEach
    void beforeEach() {
        subject = new BinarySearch();
    }

    @Test
    void shouldFindTarget() {
        char[] data = {A,B,C,D,E};
        assertEquals(1, subject.search(data, B));
    }

    @Test
    void shouldNotFindTarget() {
        char[] data = {A,B,C,D,E};
        assertEquals(-1, subject.search(data, 'F'));
    }
}
