package com.owenguo.adapter.interfaceadapter;

public class Phone {

    private Voltage5VAnd10V voltage5V;

    public Phone(Voltage5VAnd10V voltage5V) {
        this.voltage5V = voltage5V;
    }

    public void charging() {
        System.out.println("正在充电，使用电压为：" + voltage5V.output5V() + "V");
    }

}
