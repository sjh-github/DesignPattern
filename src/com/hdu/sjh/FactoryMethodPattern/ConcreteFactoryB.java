package com.hdu.sjh.FactoryMethodPattern;

//产品B具体工厂
public class ConcreteFactoryB implements Factory {

    @Override
    public Product getProduct() {
        Product product = null;
        product = new ConcreteProductB();
        return product;
    }
}
