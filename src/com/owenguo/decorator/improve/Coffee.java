package com.owenguo.decorator.improve;

public class Coffee extends Drink{
    @Override
    public Double cost() {
        // 对于单体咖啡就是价格
        return super.getPrice();
    }
}
