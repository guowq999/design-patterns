package com.owenguo.facade;

/**
 * 投影仪
 *
 * @author wenqiang
 * @date 2023/5/29
 */
public class Projector {
    private final static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    /**
     * 打开
     */
    public void on() {
        System.out.println("Projector on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("Projector off");
    }

    /**
     * 播放
     */
    public void play() {
        System.out.println("Projector play");
    }

    /**
     * 聚焦
     */
    public void projector() {
        System.out.println("Projector projector");
    }
}
