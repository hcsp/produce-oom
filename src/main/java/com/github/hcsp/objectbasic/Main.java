package com.github.hcsp.objectbasic;

import sun.plugin.javascript.navig.Array;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Object[] arr = new Object[10000];
        for (int i = 0; i < 1000000000; i++) {
            arr[i] = new byte[2048 * 2048];
        }
    }
}
