package com.owenguo.factory.methodFactory.order;


import com.owenguo.factory.methodFactory.pizza.BJCheessPizza;
import com.owenguo.factory.methodFactory.pizza.BJGreekPizza;
import com.owenguo.factory.methodFactory.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    public Pizza getPizza(String taste) {
        Pizza pizza = null;
        if ("希腊披萨".equals(taste)) {
            pizza = new BJGreekPizza();
        } else if ("奶酪披萨".equals(taste)) {
            pizza = new BJCheessPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
