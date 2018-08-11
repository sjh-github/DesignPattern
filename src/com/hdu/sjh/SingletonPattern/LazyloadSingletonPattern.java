package com.hdu.sjh.SingletonPattern;

//多线程懒汉式单例模式
public class LazyloadSingletonPattern {
    private static LazyloadSingletonPattern tm = null;

    //构造函数私有化
    private LazyloadSingletonPattern() {

    }

    //向外界提供实例（双重检查锁定）
    public static LazyloadSingletonPattern getTm() {
        if (tm == null) {
            synchronized (LazyloadSingletonPattern.class) {
                if (tm == null) {
                    tm = new LazyloadSingletonPattern();
                }
            }
        }
        return tm;
    }
}
