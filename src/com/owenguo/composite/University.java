package com.owenguo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学类
 */
public class University {
    /**
     * 名称
     */
    private String name;

    /**
     * 学院
     */
    private List<College> collegeList = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addCollegeList(College college) {
        collegeList.add(college);
    }

    public void print() {
        System.out.println("大学：" + name);

        for (College college : collegeList) {
            college.print();
        }
    }
}
