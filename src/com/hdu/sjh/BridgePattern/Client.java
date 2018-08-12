package com.hdu.sjh.BridgePattern;

//客户端
public class Client {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction1();
        Implenmentor implenmentor = new ConcreteImplementorA();
        abstraction.setImplenmentor(implenmentor);
        abstraction.seetings();
        abstraction.implenmentor.doSomething();
    }
}
