package com.practice.solve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeFormatterTest {

    @Test
    public void testFormat(){
        TimeFormatter formatter = new TimeFormatter();
        assertEquals("1 second", formatter.format2(1));
        assertEquals("1 minute and 2 seconds", formatter.format2(62));
        assertEquals("2 minutes", formatter.format2(120));
        assertEquals("1 hour", formatter.format2(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", formatter.format2(3662));
        assertEquals("99 days, 15 hours, 9 minutes and 14 seconds", formatter.format2(8608154));
    }

    @Test
    public void testFormat2(){
        TimeFormatter formatter = new TimeFormatter();
        assertEquals("1 second", formatter.format(1));
        assertEquals("1 minute and 2 seconds", formatter.format(62));
        assertEquals("2 minutes", formatter.format(120));
        assertEquals("1 hour", formatter.format(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", formatter.format(3662));
        assertEquals("99 days, 15 hours, 9 minutes and 14 seconds", formatter.format(8608154));
    }

}