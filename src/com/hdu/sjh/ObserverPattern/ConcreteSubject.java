package com.hdu.sjh.ObserverPattern;

//具体目标对象
public class ConcreteSubject extends Subject{

    @Override
    public void update() {
        for (Observer o : observerList) {
            o.update();
        }
    }
}
