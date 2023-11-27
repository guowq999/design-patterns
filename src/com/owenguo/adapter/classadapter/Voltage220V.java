package com.owenguo.adapter.classadapter;

public class Voltage220V {

    private Integer src = 220;

    public Integer output220V() {
        System.out.println("输出电压" + src + "V");
        return src;
    }
}
