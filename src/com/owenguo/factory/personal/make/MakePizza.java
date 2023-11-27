package com.owenguo.factory.personal.make;

import com.owenguo.factory.personal.pizza.CheessPizza;
import com.owenguo.factory.personal.pizza.GreekPizza;
import com.owenguo.factory.personal.pizza.Pizza;

public class MakePizza {

    public Pizza make(String taste) {
        Pizza pizza = null;

        if ("希腊披萨".equals(taste)) {
            pizza = new GreekPizza();
        } else if ("奶酪披萨".equals(taste)) {
            pizza = new CheessPizza();
        } else {
            return null;
        }
        // 需要自己执行过程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
