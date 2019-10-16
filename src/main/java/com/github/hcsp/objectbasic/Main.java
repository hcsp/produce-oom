package com.github.hcsp.objectbasic;

import java.util.LinkedList;
import java.util.List;

public class Main {
    private byte[] bytes = new byte[1024 * 1024];

    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        List<Main> mains = new LinkedList<>();
        while (true) {
            mains.add(new Main());
        }
    }
}
