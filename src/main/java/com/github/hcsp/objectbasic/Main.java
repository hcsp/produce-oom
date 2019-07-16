package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        int i = 0, j = 0;
        final int limit = 100_000_000;
        Byte[][] list = new Byte[limit][limit];
        while (i < limit) {
            while (j < limit) {
                list[i][j] = new Byte("1");
                j++;
            }
            i++;
        }
        System.out.println("finish");
    }
}
