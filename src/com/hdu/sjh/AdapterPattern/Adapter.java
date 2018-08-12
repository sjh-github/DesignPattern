package com.hdu.sjh.AdapterPattern;

//适配器
public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
