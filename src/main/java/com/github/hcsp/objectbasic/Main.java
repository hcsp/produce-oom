package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = new byte[1024 * 1024];
        }
    }
}
