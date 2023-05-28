package com.github.hcsp.objectbasic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true)
        {
            byte[] array = new byte[Integer.MAX_VALUE];
            list.add(array);
        }
    }
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
}
