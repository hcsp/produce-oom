package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        int length = 1024*10;
        Object[] arrays = new Object[length];
        for (int i = 0; i < length; i++) {
            arrays[i] = new byte[1024*1024];
        }
    }
}
