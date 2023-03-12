package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < 1000000; j++) {
                text.append("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
            }
        }
    }
}
