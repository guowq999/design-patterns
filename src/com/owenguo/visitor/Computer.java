package com.owenguo.visitor;

/**
 * 电脑
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class Computer {

    private CpuHardware cpu;

    private DiskHardware disk;

    private OperatingSystemVisitor visitor;

    public Computer(OperatingSystemVisitor visitor) {
        cpu = new CpuHardware();
        disk = new DiskHardware();
        this.visitor = visitor;
    }

    public void printCpu() {
        cpu.accept(visitor);
        System.out.println("CPU输出：" + cpu.getCommond());
    }

    public void printDisk() {
        disk.accept(visitor);
        System.out.println("磁盘输出：" + disk.getCommond());
    }
}
