package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        int[][][] a = new int[9999][9999][9999];
        for (int i = 0; i < 9999; i++) {
            for (int j = 0; j < 9999; j++) {
                for (int k = 0; k < 9999; k++) {
                    a[i][j][k] = 1024 * 1024;
                }
            }
        }
    }
}
