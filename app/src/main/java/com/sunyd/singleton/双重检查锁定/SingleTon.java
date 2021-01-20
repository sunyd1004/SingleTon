package com.sunyd.singleton.双重检查锁定;

/**
 * 线程安全
 * 懒加载效果
 * 效率高
 * volatile影响一点性能，高并发的时候可能会有缺陷。
 *
 * Created by sunyd on 2021/1/20
 */
public class SingleTon {

    private volatile static SingleTon instance = null;

    private SingleTon(){}

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }
}
