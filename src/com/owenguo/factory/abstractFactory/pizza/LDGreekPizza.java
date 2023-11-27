package com.owenguo.factory.abstractFactory.pizza;



public class LDGreekPizza extends Pizza {

    private String name = "伦敦口味希腊披萨";

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
