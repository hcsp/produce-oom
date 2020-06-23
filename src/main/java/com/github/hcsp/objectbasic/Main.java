package com.github.hcsp.objectbasic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            msg.append(Arrays.toString(new byte[1024 * 1024]));
        }
    }
}
