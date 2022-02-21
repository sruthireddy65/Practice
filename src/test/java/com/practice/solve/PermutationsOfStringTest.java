package com.practice.solve;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsOfStringTest {

    @Test
    public void testFindPermutations(){
        PermutationsOfString permutations = new PermutationsOfString();
        assertIterableEquals(Stream.of("ab", "ba").collect(Collectors.toSet()), permutations.findPermutations("ab", 0, new HashSet<String>()));
        assertIterableEquals(Stream.of("a").collect(Collectors.toSet()), permutations.findPermutations("a", 0, new HashSet<String>()));
        assertIterableEquals(Stream.of("aabb","abab","abba","baab","baba","bbaa").collect(Collectors.toSet()), permutations.findPermutations("aabb", 0, new HashSet<String>()));
    }

}