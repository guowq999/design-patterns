package com.owenguo.composite;

public class DepartmentImpl extends Department{
    public DepartmentImpl(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("系：" + getName());
    }
}
