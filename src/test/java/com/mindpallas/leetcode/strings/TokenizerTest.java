package com.mindpallas.leetcode.strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class TokenizerTest {

    @Test
    void testTokenize2All() {
        List<String> vocab = List.of("a", "b", "ab", "ba");

        var result = Tokenizer.tokenize2All("ab", vocab);

        assertEquals(1, result.size());
        assertEquals(List.of("a", "b"), result.get(0));
    }

    @Test
    void testNoSplits() {
        List<String> vocab = List.of("x", "y");

        var result = Tokenizer.tokenize2All("ab", vocab);

        assertTrue(result.isEmpty());
    }
}
