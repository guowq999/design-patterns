package com.owenguo.factory.methodFactory.order;


import com.owenguo.factory.methodFactory.pizza.*;

public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza getPizza(String taste) {
        Pizza pizza = null;
        if ("希腊披萨".equals(taste)) {
            pizza = new LDGreekPizza();
        } else if ("奶酪披萨".equals(taste)) {
            pizza = new LDCheessPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
