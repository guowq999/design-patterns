package com.owenguo.factory.simpleFactory.order;

import com.owenguo.factory.simpleFactory.pizza.Pizza;
import com.owenguo.factory.simpleFactory.simpleFatory.SimpleFactory;

public class OrderPizza {
    public Pizza order(String taste) {
        Pizza pizza = SimpleFactory.make(taste);
        return pizza;
    }
}
