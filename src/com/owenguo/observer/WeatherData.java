package com.owenguo.observer;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private double temperatrue;

    private double pressure;

    private double humidity;

    List<Observer> list = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    /**
     * 设置信息
     *
     * @param temperatrue
     * @param pressure
     * @param humidity
     */
    public void set(double temperatrue, double pressure, double humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity =humidity;
    }

    /**
     * 推送给企业
     *
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(temperatrue, pressure, humidity);
        }
    }
}
