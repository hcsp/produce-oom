package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        int 十亿 = 10_0000_0000;
        Object[] array = new Object[十亿];

        for (int i = 0; i < 十亿; i++) {
            array[i] = new char[1024 * 1024];
        }
    }
}
