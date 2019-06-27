package com.github.hcsp.objectbasic;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        List<StringBuffer> list= new ArrayList<>();//StringBuffer类可以多次修改，而且不产生新的对象。
        while (true){//定义死循环
            StringBuffer s=new StringBuffer();
            for (int i = 0; i <Math.pow(10240,10240) ; i++) {
                s.append(i);//往s中加入元素，一个s占400兆个字节
                //s占用内存越大，崩的越快，亲测
            }
            list.add(s);
        }
      }
    }


