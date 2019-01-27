package com.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickSortTest {

    private static final char A = 'A';

    private static final char B = 'B';

    private static final char C = 'C';

    private static final char D = 'D';

    private QuickSort subject;

    @BeforeEach
    void beforeEach() {
        subject = new QuickSort();
    }

    @Test
    void shouldShortArray() {
        char[] data = {D,C,B,A};
        subject.sort(data);
        assertEquals(A, data[0]);
        assertEquals(B, data[1]);
        assertEquals(C, data[2]);
        assertEquals(D, data[3]);
    }

    @Test
    void shouldNotShortArray() {
        char[] data = {A,B,C,D};
        subject.sort(data);
        assertEquals(A, data[0]);
        assertEquals(B, data[1]);
        assertEquals(C, data[2]);
        assertEquals(D, data[3]);
    }
}
