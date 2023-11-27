package com.owenguo.factory.abstractFactory.pipeline;


import com.owenguo.factory.abstractFactory.pizza.BJCheessPizza;
import com.owenguo.factory.abstractFactory.pizza.BJGreekPizza;
import com.owenguo.factory.abstractFactory.pizza.Pizza;

public class BJ extends Pipeline{
    @Override
    public Pizza makePizza(String taste) {
        Pizza pizza = null;

        if ("希腊披萨".equals(taste)) {
            pizza = new BJGreekPizza();
        } else if ("奶酪披萨".equals(taste)) {
            pizza = new BJCheessPizza();
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
