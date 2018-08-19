package com.hdu.sjh.TemplateMethodPattern;

//抽象模板方法
public abstract class AbstractClass {
    public void templateMethod() {
        operation1();
        operation2();
        operation3();
    }

    public void operation1() {
        System.out.println("AbstractClass operation1");
    }

    public abstract void operation2();

    public void operation3() {
        System.out.println("AbstractClass operation3");
    }
}
