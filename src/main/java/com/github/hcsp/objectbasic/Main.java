package com.github.hcsp.objectbasic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        List<StringBuffer> list = new ArrayList<>();
        while(true)
        {
            StringBuffer s = new StringBuffer();
            for (int i = 0; i <10000 ; i++) {
                s.append(i);
            }
            list.add(s);

        }

    }
}
