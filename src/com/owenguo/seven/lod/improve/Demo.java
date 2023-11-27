package com.owenguo.seven.lod.improve;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // 在学校中增加打印学生名字的方法，这样代码就没有陌生朋友了
        School school = new School();
        school.print();
    }

}

/**
 * 学生
 */
class Child {
    String name;

    public Child(String name) {
        this.name = name;
    }
}

/**
 * 学校
 */
class School {
    /**
     * 学校学生
     */
    List<Child> childLis;

    public List<Child> getChildLis() {
        return childLis;
    }

    School() {
        List<Child> list = new ArrayList<>();
        list.add(new Child("张三"));
        list.add(new Child("李四"));
        childLis = list;
    }

    public void print() {
        for (Child child : childLis) {
            System.out.println(child.name);
        }
    }
}
