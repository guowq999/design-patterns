package com.owenguo.composite;

public class Client {
    public static void main(String[] args) {
        // 创建大学
        University university = new University("清华大学");

        // 创建学院
        CollegeImpl college1 = new CollegeImpl("计算机学院");
        CollegeImpl college2 = new CollegeImpl("信息工程学院");

        // 创建系
        college1.addDepartment(new DepartmentImpl("软件工程"));
        college1.addDepartment(new DepartmentImpl("网络工程"));
        college1.addDepartment(new DepartmentImpl("计算机科学与技术"));

        college2.addDepartment(new DepartmentImpl("通信工程"));
        college2.addDepartment(new DepartmentImpl("信息工程"));

        university.addCollegeList(college1);
        university.addCollegeList(college2);

        // 打印整个大学的组织架构
        university.print();

        // 打印计算机学院的组织架构
//        college1.print();
    }
}
