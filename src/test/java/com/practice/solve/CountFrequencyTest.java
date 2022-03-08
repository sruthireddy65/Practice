package com.practice.solve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountFrequencyTest {

    @Test
    void testCount() {
        CountFrequency countFrequency = new CountFrequency();
        assertEquals("a3b2c1", countFrequency.count("aaabbc"));
        assertEquals("a1b1c1", countFrequency.count("abc"));
        assertEquals("a5", countFrequency.count("aaaaa"));
        assertEquals("12a1b111", countFrequency.count("11ab1"));
    }
}