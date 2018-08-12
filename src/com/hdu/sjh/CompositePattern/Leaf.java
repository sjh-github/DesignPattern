package com.hdu.sjh.CompositePattern;

//叶子构件
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void addComponent(Component c) {
        System.out.println("叶子构件无法执行添加方法");
    }

    @Override
    public void removeComponent(Component c) {
        System.out.println("叶子构件无法执行移除方法");
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name + " - 叶子构件业务方法");
    }
}
