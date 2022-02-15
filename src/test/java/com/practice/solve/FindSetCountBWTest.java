package com.practice.solve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSetCountBWTest {

    @Test
    public void testFindSetBits(){
        FindSetCountBW findSetCountBW = new FindSetCountBW();
        assertEquals(2, findSetCountBW.findSetBits(3));
        assertEquals(1, findSetCountBW.findSetBits(4));
    }

}