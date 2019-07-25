package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Object[][] a = new Object[1024][1024];
        for (int i = 0;i < 1024;i++){
            for (int j = 0;j < 1024;j++){
                a[i][j] = new int[1024];
            }
        }
    }
}
