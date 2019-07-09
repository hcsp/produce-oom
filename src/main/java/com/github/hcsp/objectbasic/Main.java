package com.github.hcsp.objectbasic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        ArrayList<Long> arr = new ArrayList<>();
        for(long i = 0; i < Long.MAX_VALUE; i ++){
            arr.add(i);
        }
        System.out.println(arr);
    }
}
