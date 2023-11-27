package com.owenguo.factory.abstractFactory.order;

import com.owenguo.factory.abstractFactory.pipeline.Pipeline;
import com.owenguo.factory.abstractFactory.pizza.Pizza;

public class OrderPizza {
    public Pizza order(String taste, Pipeline pipeline) {
        Pizza pizza = pipeline.makePizza(taste);
        return pizza;
    }
}
