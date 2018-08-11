package com.hdu.sjh.BuilderPattern;

//抽象建造者
public abstract class Builder {
    protected Product product = new Product();

    //抽象建造部件方法
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct() {
        return product;
    }
}
