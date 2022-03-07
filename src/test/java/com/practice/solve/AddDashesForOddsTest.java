package com.practice.solve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDashesForOddsTest {

    @Test
    public void testAddDashes(){
        AddDashesForOdds add = new AddDashesForOdds();
        assertEquals("2-7-4", add.addDashes(274));
        assertEquals("5-3-1-1", add.addDashes(5311));
        assertEquals("86-3-20", add.addDashes(86320));
        assertEquals("9-7-4-3-02", add.addDashes(974302));
    }

}