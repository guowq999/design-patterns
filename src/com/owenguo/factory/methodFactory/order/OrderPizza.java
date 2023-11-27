package com.owenguo.factory.methodFactory.order;


import com.owenguo.factory.methodFactory.pizza.Pizza;

public abstract class OrderPizza {

    public Pizza makePizza(String taste) {
        Pizza pizza = getPizza(taste);
        // 工厂制作
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza getPizza(String taste);
}
