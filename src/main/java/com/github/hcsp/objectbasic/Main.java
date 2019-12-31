package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Object obj = new String[1000000];
        for (int i = 0; i < 1000000; i++) {
            obj = new Integer[100000*100000];
        }
    }
}
