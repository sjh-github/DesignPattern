package com.hdu.sjh.FactoryMethodPattern;

//抽象产品类
public abstract class Product {
    //公共方法
    public void methodSame() {
        System.out.println("公共方法");
    }
    //抽象方法
    abstract public void methodDiff();

}
