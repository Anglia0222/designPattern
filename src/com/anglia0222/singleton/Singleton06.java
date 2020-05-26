package com.anglia0222.singleton;

/**
 * 静态内部类：
 * （1）外层类加载时，内部类不会加载
 * （2）内部类加载时，是线程安全的
 */
public class Singleton06 {
    private Singleton06(){}

    private static class SingletonInstance{
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
