package com.owenguo.factory.simpleFactory.pizza;

public abstract class Pizza {
    /**
     * 准备材料
     */
    public abstract void prepare();

    /**
     * 烘焙
     */
    public abstract void bake();

    /**
     * 切皮萨
     */
    public abstract void cut();

    /**
     * 打包
     */
    public abstract void box();
}
