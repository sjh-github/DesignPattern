package com.hdu.sjh.MediatorPattern;

import java.util.ArrayList;

//抽象中介者
public abstract class Mediator {
    protected ArrayList<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    public abstract void operation();
}
