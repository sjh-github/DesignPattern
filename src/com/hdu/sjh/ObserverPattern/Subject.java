package com.hdu.sjh.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//目标对象
public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public abstract void update();
}
