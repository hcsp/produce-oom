package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Object[] count = new Object[100000000];
        int x = 0;
        while (true) {
            count[x] = new int[99999999];
            x += 1;
        }
    }
}
