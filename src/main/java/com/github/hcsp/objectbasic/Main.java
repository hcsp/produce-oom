package com.github.hcsp.objectbasic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
       Object[] array = new Object[10000];
        for (int i = 0;i<1000;i++){
            array[i] = new byte[2048*2048];
        }
    }
}
