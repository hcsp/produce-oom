package com.github.hcsp.objectbasic;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        ArrayList<Object> arr = new ArrayList<>();
        while (true) {
            arr.add(new byte[1024 * 1024]);
        }
    }
}
