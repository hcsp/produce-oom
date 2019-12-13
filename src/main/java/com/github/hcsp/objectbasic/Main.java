package com.github.hcsp.objectbasic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object arr[] = new Object[1000000000];
        Arrays.fill(arr, 1024 * 1024*1024);
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
    }
}
