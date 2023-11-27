package com.owenguo.seven.single;

public class Demo {
    public static void main(String[] args) {
        Transportation ransportation = new Transportation();

        ransportation.runWay("汽车");

        ransportation.runSky("飞机");

        ransportation.runWater("轮船");
    }
}

class Transportation {
    public void runWay(String vehicle) {
        System.out.println(vehicle + "在公路上行驶");
    }

    public void runSky(String vehicle) {
        System.out.println(vehicle + "在天空上飞行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中上行驶");
    }
}

class SkyTransportation {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上飞行");
    }
}

class WaterTransportation {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中上行驶");
    }
}
