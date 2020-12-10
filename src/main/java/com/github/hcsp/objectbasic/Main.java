package com.github.hcsp.objectbasic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Byte[]> list = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            list.add(new Byte[1024*1024*100]);
        }
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
    }
}
