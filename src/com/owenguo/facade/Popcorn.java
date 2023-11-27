package com.owenguo.facade;

/**
 * 爆米花
 *
 * @author wenqiang
 * @date 2023/5/29
 */
public class Popcorn {
    private final static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    /**
     * 打开
     */
    public void on() {
        System.out.println("Popcorn on");
    }

    /**
     * 出爆米花
     */
    public void pop() {
        System.out.println("Popcorn pop");
    }

    /**
     * 关闭
     */
    public void off() {
        System.out.println("Popcorn off");
    }
}
