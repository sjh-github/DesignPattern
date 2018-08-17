package com.hdu.sjh.StatePattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.changeState("A");
        context.request();
        context.changeState("B");
        context.request();
    }
}
