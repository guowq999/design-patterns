package com.owenguo.visitor;

/**
 * 访问者 操作系统版本1
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class OperatingSystemVersion_1 implements OperatingSystemVisitor{

    @Override
    public void operateCpu(CpuHardware cpu) {
        cpu.setCommond("运算1+1=1");
    }

    @Override
    public void operateDisk(DiskHardware disk) {
        disk.setCommond("记住1+1=1");
    }
}
