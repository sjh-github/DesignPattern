package com.hdu.sjh.ProxyPattern;

//真实主题对象
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实主题业务方法");
    }
}
