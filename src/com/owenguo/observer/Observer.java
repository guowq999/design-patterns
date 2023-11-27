package com.owenguo.observer;

public interface Observer {
    /**
     * 更新信息
     */
    void update(double temperatrue, double pressure, double humidity);
}
