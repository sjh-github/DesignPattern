package com.hdu.sjh.TemplateMethodPattern;

//客户端
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
