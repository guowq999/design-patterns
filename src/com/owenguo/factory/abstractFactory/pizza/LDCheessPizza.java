package com.owenguo.factory.abstractFactory.pizza;



public class LDCheessPizza extends Pizza {
    /**
     * 披萨种类
     */
    private String name = "伦敦口味奶酪披萨";

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
