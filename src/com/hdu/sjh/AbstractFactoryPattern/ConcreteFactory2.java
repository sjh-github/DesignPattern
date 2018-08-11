package com.hdu.sjh.AbstractFactoryPattern;

//2号产品具体工厂
public class ConcreteFactory2 extends AbstractFactory {
    //生产A2产品
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }
    //生产B2产品
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
