package com.owenguo.decorator.improve;

public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDesc("Milk");
        setPrice(1.10);
    }
}
