package com.hdu.sjh.AbstractFactoryPattern;

//抽象工厂
public abstract class AbstractFactory {
    //生产A产品
    public abstract AbstractProductA createProductA();
    //生产B产品
    public abstract AbstractProductB createProductB();
}
