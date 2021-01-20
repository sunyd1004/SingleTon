package com.sunyd.singleton.懒汉式1;

/**
 * 线程不安全
 * 懒加载效果
 *
 * Created by sunyd on 2021/1/20
 */
public class SingleTon {

    private static SingleTon instance = null;

    private SingleTon() {}

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
