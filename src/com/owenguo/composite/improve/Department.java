package com.owenguo.composite.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 系
 */
public class Department extends OrganizationComponent{

    public Department(String name) {
        super(name);
    }

    /**
     * 重新打印方法
     *
     */
    @Override
    public void print() {
        System.out.println("系：" + getName());
    }
}
