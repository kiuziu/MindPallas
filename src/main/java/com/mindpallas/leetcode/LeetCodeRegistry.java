package com.mindpallas.leetcode;

import com.mindpallas.core.LeetCodeTaskRegistry;

// -------------------------
// Arrays
// -------------------------
import com.mindpallas.leetcode.arrays.MaximumProductOfTwoElementsTask;
import com.mindpallas.leetcode.arrays.TwoSumTask;

// -------------------------
// Math
// -------------------------
import com.mindpallas.leetcode.math.MaxProductOfTwoDigitsTask;

// -------------------------
// Strings
// -------------------------
import com.mindpallas.leetcode.strings.ReverseStringTask;
import com.mindpallas.leetcode.strings.TokenizerTask;

// -------------------------
// Dynamic Programming (dp)
// -------------------------
// (weitere Tasks bei Bedarf)
// import com.mindpallas.leetcode.dp.SomeDpTask;

// -------------------------
// Graph
// -------------------------
// import com.mindpallas.leetcode.graph.SomeGraphTask;

// -------------------------
// Greedy
// -------------------------
// import com.mindpallas.leetcode.greedy.SomeGreedyTask;

// -------------------------
// Tree
// -------------------------
// import com.mindpallas.leetcode.tree.SomeTreeTask;

// -------------------------
// Misc
// -------------------------
// import com.mindpallas.leetcode.misc.SomeMiscTask;

/**
 * Zentrale Registry für alle LeetCode-Tasks in MindPallas.
 * Jede neue Aufgabe MUSS hier registriert werden,
 * damit sie im System sichtbar und ausführbar ist.
 */
public class LeetCodeRegistry {

    public void registerAll(LeetCodeTaskRegistry registry) {

        // -------------------------
        // Arrays
        // -------------------------
        registry.register(new MaximumProductOfTwoElementsTask());
        registry.register(new TwoSumTask());

        // -------------------------
        // Math
        // -------------------------
        registry.register(new MaxProductOfTwoDigitsTask());

        // -------------------------
        // Strings
        // -------------------------
        registry.register(new ReverseStringTask());
        registry.register(new TokenizerTask());

        // -------------------------
        // Dynamic Programming (dp)
        // -------------------------
        // registry.register(new SomeDpTask());

        // -------------------------
        // Graph
        // -------------------------
        // registry.register(new SomeGraphTask());

        // -------------------------
        // Greedy
        // -------------------------
        // registry.register(new SomeGreedyTask());

        // -------------------------
        // Tree
        // -------------------------
        // registry.register(new SomeTreeTask());

        // -------------------------
        // Misc
        // -------------------------
        // registry.register(new SomeMiscTask());
    }
}
