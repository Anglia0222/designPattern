package com.anglia0222.singleton;

/**
 * 懒汉式：线程不安全
 */
public class Singleton03 {

    private static Singleton03 instance;

    private Singleton03(){}

    public static Singleton03 getInstance(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }

}
