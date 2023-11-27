package com.owenguo.visitor;

/**
 * 访问者 操作系统
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public interface OperatingSystemVisitor {
    /**
     * 访问者操作CPU
     *
     * @param cpu
     */
    void operateCpu(CpuHardware cpu);

    /**
     * 访问者操作Disk
     *
     * @param disk
     */
    void operateDisk(DiskHardware disk);
}
