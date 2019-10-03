package com.github.hcsp.objectbasic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        List<List<String>> values = new ArrayList<>();
        int i = 0;
        while(true) {
            List<String> data = new ArrayList<>(1000000);
            values.add(data);
        }
    }
}
