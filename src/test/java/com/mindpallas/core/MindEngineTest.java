package com.mindpallas.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MindEngineTest {

    @Test
    void testRun() {
        var engine = new MindEngine();
        assertDoesNotThrow(engine::run);
    }
}
