package com.github.hcsp.objectbasic;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        while (true) {
            map.put(i++, "gavin");
        }
    }
}
