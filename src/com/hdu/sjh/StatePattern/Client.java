package com.hdu.sjh.StatePattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.request();
        context.changeState("B");
        context.request();
    }
}
