package org.demo.dummy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DummyTests {

    @Disabled
    @Test
    void testFail() {
        Assertions.fail();
    }

    @Test
    void testPath() {
        Assertions.assertTrue(true);
    }
}
