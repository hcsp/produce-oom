package com.github.hcsp.objectbasic;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        ArrayList<BigInteger> list = new ArrayList<BigInteger>();
        while(true){
            list.add(new BigInteger("99999999999999999999999999999999"));
        }
    }
}
