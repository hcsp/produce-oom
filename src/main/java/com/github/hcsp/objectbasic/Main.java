package com.github.hcsp.objectbasic;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Byte[] space = new Byte[1024 * 1024 * 1024];
    }
}
