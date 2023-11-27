package com.owenguo.factory.abstractFactory;

import com.owenguo.factory.abstractFactory.order.OrderPizza;
import com.owenguo.factory.abstractFactory.pipeline.LD;

public class Main {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.order("希腊披萨", new LD());
    }
}
