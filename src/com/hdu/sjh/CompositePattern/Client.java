package com.hdu.sjh.CompositePattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Component c1, c2, c3, c4, c5;
        c1 = new Composite("文件夹A");
        c2 = new Composite("文件夹B");
        c3 = new Leaf("文件AA");
        c4 = new Leaf("文件AB");
        c5 = new Leaf("文件BA");
        c1.addComponent(c3);
        c1.addComponent(c4);
        c2.addComponent(c5);
        c1.addComponent(c2);
        c1.operation();
    }
}
