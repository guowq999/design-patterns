package com.owenguo.visitor;

/**
 * 硬件设施接口
 * @author wenqiang
 * @date 2023/6/1
 */
public interface Hardware {

    /**
     * 所有的硬件都可以被访问者访问
     *
     * @param visitor
     */
    void accept(OperatingSystemVisitor visitor);
}
