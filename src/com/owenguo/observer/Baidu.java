package com.owenguo.observer;

public class Baidu implements Observer{

    private double temperatrue;

    private double pressure;

    private double humidity;

    public void display(double temperatrue, double pressure, double humidity) {
        System.out.println("Baidu温度：" + temperatrue);
        System.out.println("Baidu湿度：" + pressure);
        System.out.println("Baidu气压：" + humidity);
    }

    @Override
    public void update(double temperatrue, double pressure, double humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display(this.temperatrue, this.pressure, this.humidity);
    }
}
