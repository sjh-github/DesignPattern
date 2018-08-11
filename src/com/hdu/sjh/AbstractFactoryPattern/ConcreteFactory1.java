package com.hdu.sjh.AbstractFactoryPattern;

//1号产品具体工厂
public class ConcreteFactory1 extends AbstractFactory {

    //生产A1产品
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    //生产A2产品
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
