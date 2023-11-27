package com.owenguo.decorator.improve;

public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDesc("Chocolate");
        setPrice(1.00);
    }
}
