package com.hdu.sjh.PrototypePattern;

//具体原型类
public class ConcretePrototype implements Cloneable {
    private String name;
    private int age;
    private Integer[] array;

    public ConcretePrototype(String name, Integer age, Integer[] array) {
        this.name = name;
        this.age = age;
        this.array = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public ConcretePrototype clone() {
        Object o = null;
        try {
            o = super.clone();
            o = (ConcretePrototype)o;
            //深复制
            ((ConcretePrototype) o).setArray(this.array.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (ConcretePrototype)o;
    }
}
