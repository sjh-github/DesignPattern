package com.hdu.sjh.FacadePattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
