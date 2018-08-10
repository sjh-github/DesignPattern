package com.hdu.sjh.FactoryMethodPattern;

//具体产品类A
public class ConcreteProductA extends Product {

    @Override
    public void methodDiff() {
        //具体业务方法的实现
        System.out.println("产品A");
    }
}
