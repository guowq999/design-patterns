package com.owenguo.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        // 匿名内部类实现
        AbsVoltage5VAnd10V absVoltage5VAnd10V = new AbsVoltage5VAnd10V(new Voltage220V()) {
            @Override
            public Integer output5V() {
                Integer out = super.getVoltage220V().output220V() / 44;
                System.out.println("输入电压" + super.getVoltage220V().output220V() + "V，输出电压" + out + "V");
                return out;
            }
        };

        Phone phone = new Phone(absVoltage5VAnd10V);
        phone.charging();
    }
}
