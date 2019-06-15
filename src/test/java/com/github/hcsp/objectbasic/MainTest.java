package com.github.hcsp.objectbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        try {
            Main.main(null);
        } catch (OutOfMemoryError e) {
            Assertions.assertTrue(e.getMessage().contains("heap space"));
            long totalMemory = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            Assertions.assertTrue(totalMemory - freeMemory > freeMemory);
            return;
        }
        Assertions.assertTrue(false);
    }
}
