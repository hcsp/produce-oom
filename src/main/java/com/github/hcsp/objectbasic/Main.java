package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Object[]a=new Object[10000] ;
        for (int i = 0; i < Math.pow(100,100); i++) {
            a[i] = new Object[2048*2048];
        }
    }
}
