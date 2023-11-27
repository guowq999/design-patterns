package com.owenguo.visitor;

/**
 * 操作系统版本2
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class OperatingSystemVersion_2 implements OperatingSystemVisitor{


    @Override
    public void operateCpu(CpuHardware cpu) {
        cpu.setCommond("运算1+1=2");
    }

    @Override
    public void operateDisk(DiskHardware disk) {
        disk.setCommond("记住1+1=2");
    }
}
