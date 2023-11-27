package com.owenguo.composite.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 */
public class University extends OrganizationComponent{

    /**
     * 存放学院College
     */
    private List<OrganizationComponent> org = new ArrayList<>();

    public University(String name) {
        super(name);
    }

    /**
     * 重写add方法
     *
     * @param organizationComponent
     */
    @Override
    public void add(OrganizationComponent organizationComponent) {
        org.add(organizationComponent);
    }

    /**
     * 重写remove方法
     *
     * @param organizationComponent
     */
    @Override
    public void remove(OrganizationComponent organizationComponent) {
        org.remove(organizationComponent);
    }

    /**
     * 重新打印方法
     *
     */
    @Override
    public void print() {
        System.out.println("学校：" + getName());
        for (OrganizationComponent organizationComponent : org) {
            organizationComponent.print();
        }
    }
}
