package com.owenguo.prototype;

public class Sheep implements Cloneable{
    public String name;
    public String age;
    public Sheep friend;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", friend=" + friend.hashCode() +
                '}';
    }
}
