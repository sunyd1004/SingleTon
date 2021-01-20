package com.sunyd.singleton.静态内部类;

/**
 * 懒加载
 * 线程安全
 * 推荐使用
 *
 * Created by sunyd on 2021/1/20
 */
public class SingleTon {

    private SingleTon(){}

    public static SingleTon getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder{
        private static final SingleTon instance = new SingleTon();
    }
}
