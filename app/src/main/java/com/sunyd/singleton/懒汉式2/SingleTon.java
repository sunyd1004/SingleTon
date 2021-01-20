package com.sunyd.singleton.懒汉式2;

/**
 * 线程安全
 * 懒加载效果
 * synchnorized会造成不必要的开销，一般情况用不到同步
 *
 * Created by sunyd on 2021/1/20
 */
public class SingleTon {

    private static SingleTon instance = null;

    private SingleTon() {}

    public static synchronized SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
