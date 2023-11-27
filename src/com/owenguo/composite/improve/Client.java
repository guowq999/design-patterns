package com.owenguo.composite.improve;

public class Client {
    public static void main(String[] args) {
        // 从大到小

        // 创建大学
        University university = new University("清华大学");

        // 创建学院
        College college1 = new College("计算机学院");
        College college2 = new College("信息工程学院");

        // 创建系
        college1.add(new Department("软件工程"));
        college1.add(new Department("网络工程"));
        college1.add(new Department("计算机科学与技术"));

        college2.add(new Department("通信工程"));
        college2.add(new Department("信息工程"));

        university.add(college1);
        university.add(college2);

        // 打印整个大学的组织架构
        university.print();

        // 打印计算机学院的组织架构
//        college1.print();

    }
}
