package com.github.hcsp.objectbasic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        ArrayList list = new ArrayList();
        for (int i = 0; i < 1e8; i++) {
            list.add(new Byte[1024* 1024]);
        }
    }
}
