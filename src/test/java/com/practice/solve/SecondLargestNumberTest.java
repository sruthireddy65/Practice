package com.practice.solve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestNumberTest {

    @Test
    void testFindSecondLargest() {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        assertEquals(34, secondLargestNumber.findSecondLargest(new int[]{ 12, 35, 1, 10, 34, 1 }));
        assertEquals(5, secondLargestNumber.findSecondLargest(new int[]{ 10, 10, 5 }));
        assertEquals(-1, secondLargestNumber.findSecondLargest(new int[]{ 10, 10, 10 }));
    }
}