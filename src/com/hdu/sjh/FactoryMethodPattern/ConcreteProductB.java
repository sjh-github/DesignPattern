package com.hdu.sjh.FactoryMethodPattern;

//具体产品类B
public class ConcreteProductB extends Product {

    @Override
    public void methodDiff() {
        //具体业务方法的实现
        System.out.println("产品B");
    }
}
