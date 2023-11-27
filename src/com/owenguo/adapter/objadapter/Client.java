package com.owenguo.adapter.objadapter;

public class Client {
    public static void main(String[] args) {
        Voltage5V voltage5V= new VoltageAdapeter(new Voltage220V());
        Phone phone = new Phone(voltage5V);
        phone.charging();
    }
}
