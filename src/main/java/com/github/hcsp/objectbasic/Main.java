package com.github.hcsp.objectbasic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        List<Byte[]> list = new ArrayList<>();
        int i = 0;
        try {
            while (true) {
                list.add(new Byte[1024 * 1024]);
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("执行了"+i+"次");
        }
    }
}
