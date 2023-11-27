package com.owenguo.facade;

/**
 * 灯光
 *
 * @author wenqiang
 * @date 2023/5/29
 */
public class TheaterLight {
    private final static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    /**
     * 打开
     */
    public void on() {
        System.out.println("TheaterLight on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("TheaterLight off");
    }

    /**
     * 调暗
     */
    public void dim() {
        System.out.println("TheaterLight dim");
    }

    /**
     * 调亮
     */
    public void bright() {
        System.out.println("TheaterLight bright");
    }
}
