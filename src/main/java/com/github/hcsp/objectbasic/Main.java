package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        int n = 100000;
        Object[] arr = new Object[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new byte[1024*1024*1024];
        }
       
    }
}
