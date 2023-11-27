package com.owenguo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public abstract class College {
    /**
     * 名称
     */
    private String name;

    /**
     * 系列表
     */
    private List<Department> departmentList = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    /**
     * 增加系
     *
     * @param department
     */
    protected void addDepartment(Department department) {
        departmentList.add(department);
    }

    protected abstract void print();
}
