package com.mindpallas.leetcode.strings;

import com.mindpallas.leetcode.LeetCodeTask;
import java.util.List;

public class TokenizerTask implements LeetCodeTask {

    @Override
    public String name() {
        return "tokenizer-2-all";
    }

    @Override
    public void run() {
        var vocab = List.of("a", "b", "ab", "ba");
        var result = Tokenizer.tokenize2All("ab", vocab);
        System.out.println("Tokenizer result: " + result);
    }
}
