package com.hdu.sjh.CompositePattern;

import java.util.ArrayList;

//容器构件
public class Composite extends Component {

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    private ArrayList<Component> components = new ArrayList<>();

    @Override
    public void addComponent(Component c) {
        components.add(c);
    }

    @Override
    public void removeComponent(Component c) {
        components.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public void operation() {
        System.out.println(name + " - 容器构件业务方法");
        //递归调用
        for (Component c : components) {
            c.operation();
        }
    }
}
