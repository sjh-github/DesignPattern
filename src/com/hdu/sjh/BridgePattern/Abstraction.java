package com.hdu.sjh.BridgePattern;

//抽象类
public abstract class Abstraction {
    protected Implenmentor implenmentor;

    public void setImplenmentor(Implenmentor implenmentor) {
        this.implenmentor = implenmentor;
    }

    public abstract void seetings();
}
