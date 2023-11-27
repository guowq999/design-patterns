package com.owenguo.factory.methodFactory;

import com.owenguo.factory.methodFactory.order.BJOrderPizza;
import com.owenguo.factory.methodFactory.order.LDOrderPizza;
import com.owenguo.factory.methodFactory.order.OrderPizza;

public class Main {
    public static void main(String[] args) {
        OrderPizza bjOrderPizza = new LDOrderPizza();
        bjOrderPizza.makePizza("希腊披萨");
    }
}
