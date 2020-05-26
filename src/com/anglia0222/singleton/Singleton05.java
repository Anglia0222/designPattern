package com.anglia0222.singleton;

/**
 * 懒汉式：线程安全，双重检查
 */
public class Singleton05 {
    private static volatile Singleton05 instance;

    private Singleton05(){}

    public static Singleton05 getInstance(){
        if(instance == null){
            synchronized (Singleton05.class){
                if(instance == null){
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }

}
