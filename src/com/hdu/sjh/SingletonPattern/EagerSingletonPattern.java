package com.hdu.sjh.SingletonPattern;

//多线程饿汉式加载
public class EagerSingletonPattern {
    private static EagerSingletonPattern tm = new EagerSingletonPattern();

    //构造函数私有化
    private EagerSingletonPattern() {

    }

    //向外界提供实例
    public static EagerSingletonPattern getTm() {
        return tm;
    }
}
