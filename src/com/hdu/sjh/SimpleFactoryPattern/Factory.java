package com.hdu.sjh.SimpleFactoryPattern;

//工厂类
public class Factory {
    //静态工厂方法
    public static Product getProduct(String productType) {
        Product product = null;
        if (productType.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            //初始化设置Product

        } else if (productType.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            //初始化设置Product

        }
        return product;
    }
}
