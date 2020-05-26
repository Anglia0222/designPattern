package com.anglia0222.singleton;

/**
 * 懒汉式：线程安全，同步方法
 * 效率低
 */
public class Singleton04 {

    private static Singleton04 instance;

    private Singleton04(){}

    public static synchronized Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }
}
