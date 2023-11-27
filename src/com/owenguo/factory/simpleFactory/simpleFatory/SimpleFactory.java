package com.owenguo.factory.simpleFactory.simpleFatory;


import com.owenguo.factory.simpleFactory.pizza.CheessPizza;
import com.owenguo.factory.simpleFactory.pizza.GreekPizza;
import com.owenguo.factory.simpleFactory.pizza.Pizza;

public class SimpleFactory {

    public static Pizza make(String taste) {
        Pizza pizza = null;

        if ("希腊披萨".equals(taste)) {
            pizza = new GreekPizza();
        } else if ("奶酪披萨".equals(taste)) {
            pizza = new CheessPizza();
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
