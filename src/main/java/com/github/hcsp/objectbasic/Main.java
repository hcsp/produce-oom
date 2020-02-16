package com.github.hcsp.objectbasic;

public class Main {

    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        for (int i = 1; i < 1000; i++) {
            short[] arr1 = new short[(int) Math.pow(1024, i)];
        }
    }
}
