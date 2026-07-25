package com.mindpallas.leetcode.strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void testReverse() {
        assertEquals("cba", ReverseString.reverse("abc"));
    }

    @Test
    void testEmpty() {
        assertEquals("", ReverseString.reverse(""));
    }

    @Test
    void testPalindrome() {
        assertEquals("level", ReverseString.reverse("level"));
    }
}
