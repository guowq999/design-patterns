package com.owenguo.adapter.interfaceadapter;

public abstract class AbsVoltage5VAnd10V implements Voltage5VAnd10V{

    private Voltage220V voltage220V;

    public AbsVoltage5VAnd10V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    @Override
    public Integer output5V() {
        return null;
    }

    @Override
    public Integer output10V() {
        return null;
    }
}
