package com.sunyd.singleton.枚举;

/**
 * 线程安全
 * 写法简单
 * 防止反序列化重新创建对象
 * 可读性不高
 * 枚举比静态常亮多费内存
 *
 * Created by sunyd on 2021/1/20
 */
public enum  SingleTon {

    INSTANCE;

    public void doSomething() {

    }
}
