package com.owenguo.factory.simpleFactory;

import com.owenguo.factory.simpleFactory.order.OrderPizza;
import com.owenguo.factory.simpleFactory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        Pizza pizza = orderPizza.order("奶酪披萨");
    }
}
