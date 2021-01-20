package com.sunyd.singleton.饿汉式;

/**
 * 写法简单，线程安全
 * 没有懒加载效果，如果不使用的话，或造成内存浪费
 *
 * Created by sunyd on 2021/1/20
 */
public class SingleTon {

    private static final SingleTon instance = new SingleTon();

    private SingleTon() {}

    public static SingleTon getInstance() {
        return instance;
    }
}
