package com.owenguo.adapter.objadapter;

public class VoltageAdapeter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapeter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public Integer output5V() {
        Integer out = voltage220V.output220V() / 44;
        System.out.println("输入电压" + voltage220V.output220V() + "V，输出电压"  + out + "V");
        return out;
    }
}
