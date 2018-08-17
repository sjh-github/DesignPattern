package com.hdu.sjh.ObserverPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Observer o1 = new ConcreteObserver("O1");
        Observer o2 = new ConcreteObserver("O2");
        Observer o3 = new ConcreteObserver("O3");
        Subject subject = new ConcreteSubject();
        subject.attach(o1);
        subject.attach(o2);
        subject.attach(o3);
        subject.update();
    }
}
