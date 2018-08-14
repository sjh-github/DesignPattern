package com.hdu.sjh.ProxyPattern;

//代理对象
public class Proxy extends Subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("代理对象preRequest()");
    }

    private void postRequest() {
        System.out.println("代理对象postRequest()");
    }
}
