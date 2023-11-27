package com.owenguo.facade;

/**
 * DVD
 *
 * @author wenqiang
 * @date 2023/5/29
 */
public class DVDPlayer {
    private final static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    /**
     * 打开
     */
    public void on() {
        System.out.println("DVD on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("DVD off");
    }

    /**
     * 播放
     */
    public void play() {
        System.out.println("DVD play");
    }

    /**
     * 暂停
     */
    public void pause() {
        System.out.println("DVD pause");
    }
}
