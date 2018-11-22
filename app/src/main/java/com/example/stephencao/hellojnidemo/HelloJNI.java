package com.example.stephencao.hellojnidemo;

public class HelloJNI {
    //一个加法函数, 用c实现
    public native int AddC (int a, int b);
    static {
        //加载库, 注意库名的一致性
        System.loadLibrary("HelloC");
    }
}
