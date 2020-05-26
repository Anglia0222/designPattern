package com.anglia0222.singleton;

/**
 * 饿汉式：静态变量
 */
public class Singleton01 {

    private static final Singleton01 instance = new Singleton01();

    private Singleton01(){
    }

    public static Singleton01 getInstance(){
        return instance;
    }

}
