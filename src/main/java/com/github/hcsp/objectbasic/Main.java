package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常

       Object[] array = new Object[100000];

       for (int i=0;i<= 1000000;i++){
           array[i]=new Byte[1024*1024];
       }

    }
}
