package com.hdu.sjh.SimpleFactoryPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Product product = null;
        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}
