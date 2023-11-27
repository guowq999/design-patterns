package com.owenguo.seven.lod;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        print(new School());
    }


    static void print(School school) {
        // 这里的Child就是陌生朋友，尽量少出现
        List<Child> childLis = school.getChildLis();
        for (Child child : childLis) {
            System.out.println(child.name);
        }
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
}
