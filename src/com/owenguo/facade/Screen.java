package com.owenguo.facade;

/**
 * 屏幕
 *
 * @author wenqiang
 * @date 2023/5/29
 */
public class Screen {
    private final static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    /**
     * 上升
     */
    public void up() {
        System.out.println("Screen up");
    }

    /**
     * 下降
     */
    public void down() {
        System.out.println("Screen down");
    }
}
