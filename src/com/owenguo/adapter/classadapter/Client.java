package com.owenguo.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone(new VoltageAdapeter());
        phone.charging();
    }
}
