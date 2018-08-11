package com.hdu.sjh.SingletonPattern;

//单线程中的单例模式
public class SingleThreadSingletonPattern {
    private static SingleThreadSingletonPattern tm = null;

    //构造方法私有化
    private SingleThreadSingletonPattern() {

    }

    //对外提供实例
    public static SingleThreadSingletonPattern getTm() {
        if (tm == null) {
            tm = new SingleThreadSingletonPattern();
        }
        return tm;
    }
}
