package com.owenguo.factory.abstractFactory.pipeline;

import com.owenguo.factory.abstractFactory.pizza.*;

public class LD extends Pipeline{
    @Override
    public Pizza makePizza(String taste) {
        Pizza pizza = null;

        if ("希腊披萨".equals(taste)) {
            pizza = new LDGreekPizza();
        } else if ("奶酪披萨".equals(taste)) {
            pizza = new LDCheessPizza();
        } else {
            return null;
        }

        // 工厂制作
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
