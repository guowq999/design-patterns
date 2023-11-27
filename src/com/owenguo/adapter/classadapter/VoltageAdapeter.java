package com.owenguo.adapter.classadapter;

public class VoltageAdapeter extends Voltage220V implements Voltage5V{
    @Override
    public Integer output5V() {
        Integer out = super.output220V() / 44;
        System.out.println("输入电压" + super.output220V() + "V，输出电压"  + out + "V");
        return out;
    }
}
