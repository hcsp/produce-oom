package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        Object[] array = new Object[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = new byte[1024 * 1024];
            /*
            大概输出的数字到了 3400+ 的时候报出 OutOfMemoryError
            这和机器的性能有关还是和 jvm 配置有关？
            * */
            System.out.println(i);
        }
    }
}
