package com.owenguo.composite;


/**
 * 计算机学院
 */
public class CollegeImpl extends College {

    public CollegeImpl(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("学院：" + getName());

        for (Department department : getDepartmentList()) {
            department.print();
        }
    }
}
