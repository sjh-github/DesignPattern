package com.hdu.sjh.ProxyPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
