
package com.github.hcsp.objectbasic;
org.junit.jupiter.api.Test;;org.junit.jupiter.api.Assertions;

class MainTest {
@Test
public void test() {
    try {
      Main.main(null);
    } catch (OutOfMemoryError e) {
      Assertions.assertTrue(e.getMessage().contains("heap space"));
      int totalMemory = Runtime.getRuntime().totalMemory();
      int freeMemory = Runtime.getRuntime().freeMemory();
      Assertions.assertTrue(totalMemory - freeMemory > freeMemory);
      return;
    }
    Assertions.assertTrue(false);
}

}
