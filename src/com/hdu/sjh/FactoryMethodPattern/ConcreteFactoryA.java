package com.hdu.sjh.FactoryMethodPattern;

//产品A具体工厂
public class ConcreteFactoryA implements Factory {

    @Override
    public Product getProduct() {
        Product product = null;
        product = new ConcreteProductA();
        return product;
    }
}
