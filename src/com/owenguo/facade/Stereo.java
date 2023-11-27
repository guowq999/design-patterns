package com.owenguo.facade;

/**
 * 立体声
 *
 * @author wenqiang
 * @date 2023/5/29
 */
public class Stereo {
    private final static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    /**
     * 打开
     */
    public void on() {
        System.out.println("Stereo on");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("Stereo off");
    }

    /**
     * 音量升高
     */
    public void up() {
        System.out.println("Stereo up");
    }
}
