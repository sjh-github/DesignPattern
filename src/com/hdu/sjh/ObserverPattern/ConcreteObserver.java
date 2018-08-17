package com.hdu.sjh.ObserverPattern;

//具体观察者
public class ConcreteObserver implements Observer {
    String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " is Updating");
    }
}
