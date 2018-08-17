package com.hdu.sjh.MediatorPattern;

//具体中介者
public class ConcreteMediator extends Mediator {

    @Override
    public void operation() {
        colleagues.get(0).method1();
    }
}
