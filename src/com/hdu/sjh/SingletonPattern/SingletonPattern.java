package com.hdu.sjh.SingletonPattern;

//优化版单例模式（静态内部类）
public class SingletonPattern {

    private SingletonPattern() {

    }

    private static class Holder {
        private static SingletonPattern singletonPattern = new SingletonPattern();
    }

    public static SingletonPattern getInstance() {
        return Holder.singletonPattern;
    }
}
