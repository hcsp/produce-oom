package com.github.hcsp.objectbasic;

import javax.swing.plaf.basic.BasicButtonUI;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Object[] memoryAllocated = new Byte[100000];
        int dummyArraySize = 1024 * 1024;
        for (int i = 0; i < memoryAllocated.length; i++) {
            memoryAllocated[i] = new Byte[dummyArraySize];
        }
    }
}
