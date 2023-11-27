package com.owenguo.composite;

/**
 * 系
 */
public abstract class Department {
    /**
     * 名称
     */
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
