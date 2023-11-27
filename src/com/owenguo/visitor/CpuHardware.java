package com.owenguo.visitor;

/**
 * CPU
 *
 * @author wenqiang
 * @date 2023/6/1
 */
public class CpuHardware implements Hardware{

    private String commond;

    public String getCommond() {
        return commond;
    }

    public void setCommond(String commond) {
        this.commond = commond;
    }

    @Override
    public void accept(OperatingSystemVisitor visitor) {
        visitor.operateCpu(this);
    }
}
