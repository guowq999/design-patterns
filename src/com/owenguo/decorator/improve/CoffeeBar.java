package com.owenguo.decorator.improve;

public class CoffeeBar {
    public static void main(String[] args) {
        // 装饰者模式下订单：2份Chocolate + 1份Mikl的LongBlack

        // 1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("单体咖啡" + order.getDesc() + "的费用：" + order.cost());

        // 2.加入一份Mikl
        order = new Milk(order);
        System.out.println("单体咖啡" + order.getDesc() + "的费用：" + order.cost());

        // 3.加入两份巧克力
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("单体咖啡" + order.getDesc() + "的费用：" + order.cost());
    }
}
