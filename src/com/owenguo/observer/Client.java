package com.owenguo.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Baidu订阅
        Baidu baidu = new Baidu();
        weatherData.registerObserver(baidu);
        weatherData.set(1.1,2.1,3.1);
        weatherData.notifyObservers();

        System.out.println("==================================");
        // Sina订阅
        Sina sina = new Sina();
        weatherData.registerObserver(sina);
        weatherData.set(11.1,22.1,33.1);
        weatherData.notifyObservers();

        System.out.println("==================================");
        // Baidu取消
        weatherData.remove(baidu);
        weatherData.set(111.1,222.1,333.1);
        weatherData.notifyObservers();
    }
}
