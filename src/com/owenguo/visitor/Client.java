package com.owenguo.visitor;

/**
 * 使用者
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystemVisitor visitor_1 = new OperatingSystemVersion_1();
        Computer computer_1 = new Computer(visitor_1);
        computer_1.printCpu();
        computer_1.printDisk();

        // 我们发现系统编写错误了，升级系统
        OperatingSystemVisitor visitor_2 = new OperatingSystemVersion_2();
        Computer computer_2 = new Computer(visitor_2);
        computer_2.printCpu();
        computer_2.printDisk();
    }
}
