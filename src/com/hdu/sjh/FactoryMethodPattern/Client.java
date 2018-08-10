package com.hdu.sjh.FactoryMethodPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.getProduct();
        product.methodSame();
        product.methodDiff();
    }
}
