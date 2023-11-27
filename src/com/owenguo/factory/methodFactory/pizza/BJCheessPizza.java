package com.owenguo.factory.methodFactory.pizza;


public class BJCheessPizza extends Pizza {
    /**
     * 披萨种类
     */
    private String name = "北京口味奶酪披萨";

    @Override
    public void prepare() {
        System.out.println(name + "准备原材料");
    }

    @Override
    public void bake() {
        System.out.println(name + "烘焙");
    }

    @Override
    public void cut() {
        System.out.println(name + "切披萨");
    }

    @Override
    public void box() {
        System.out.println(name + "打包");
    }
}
