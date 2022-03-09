package com.practice.solve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LagestPalindromeTest {

    @Test
    public void largest() {
        LagestPalindrome largest = new LagestPalindrome();
        assertEquals("malayalam", largest.largest("abcbadamalayalambmadamb"));
        assertEquals("madamadam", largest.largest("abcbadaalayalambmadamadam"));
    }
}