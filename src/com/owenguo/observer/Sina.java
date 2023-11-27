package com.owenguo.observer;

public class Sina implements Observer{

    private double temperatrue;

    private double pressure;

    private double humidity;

    public void display(double temperatrue, double pressure, double humidity) {
        System.out.println("sina温度：" + temperatrue);
        System.out.println("sina湿度：" + pressure);
        System.out.println("sina气压：" + humidity);
    }

    @Override
    public void update(double temperatrue, double pressure, double humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display(this.temperatrue, this.pressure, this.humidity);
    }
}
