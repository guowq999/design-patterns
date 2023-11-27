package com.owenguo.decorator.improve;

public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        setDesc("Soy");
        setPrice(1.20);
    }
}
