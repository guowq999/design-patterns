package com.owenguo.template;

public abstract class SoyaMilk {

    /**
     * 制作豆浆
     */
    public void make() {
        select();
        add();
        soak();
        beat();
    }

    /**
     * 挑选黄豆
     */
    private void select() {
        System.out.println("挑选上好的黄豆");
    }

    /**
     * 添加配料
     */
    public abstract void add();

    /**
     * 浸泡
     */
    private void soak() {
        System.out.println("将黄豆和配料一起浸泡三个小时");
    }

    /**
     * 打碎
     */
    private void beat() {
        System.out.println("放到豆浆机中打碎");
    }
}
