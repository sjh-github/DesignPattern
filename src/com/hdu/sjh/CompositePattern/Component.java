package com.hdu.sjh.CompositePattern;

//抽象构件
public abstract class Component {
    public abstract void addComponent(Component c);
    public abstract void removeComponent(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();
}
