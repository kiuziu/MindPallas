package com.mindpallas.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public final class Tokenizer {

    public static List<List<String>> tokenize2All(String text, List<String> vocab) {
        List<List<String>> results = new ArrayList<>();

        for (int split = 1; split < text.length(); split++) {
            String left = text.substring(0, split);
            String right = text.substring(split);

            if (vocab.contains(left) && vocab.contains(right)) {
                results.add(List.of(left, right));
            }
        }

        return results;
    }
}
